import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<String> unorderedRecipeList;
    private ArrayList<ArrayList<String>> orderedRecipeList;
    
    public RecipeBook() {
        this.unorderedRecipeList = new ArrayList<>();
        this.orderedRecipeList = new ArrayList<>();
    }

    public void add(String recipePart) {
        unorderedRecipeList.add(recipePart);
    }
    
    public void filterRecipeList() {
        ArrayList<String> currentRecipe = new ArrayList<>();
        for (String part : unorderedRecipeList) {
            if (part.isEmpty()) {
                if (!currentRecipe.isEmpty()) {
                    orderedRecipeList.add(new ArrayList<>(currentRecipe));
                    currentRecipe.clear();
                }
            } else {
                currentRecipe.add(part);
            }
        }
        if (!currentRecipe.isEmpty()) {
            orderedRecipeList.add(currentRecipe);
        }
    }
    
    public String getDishAndTime(ArrayList<String> recipe) {
        return "Recipes:\n" + recipe.get(0) + ", cooking time: " + recipe.get(1);
    }
    
    public String list() {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> recipe : orderedRecipeList) {
            result.append(getDishAndTime(recipe)).append("\n");
        }
        return result.toString();
    }
    
    public String find(String name) {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> recipe : orderedRecipeList) {
            if (recipe.get(0).contains(name)) {
                result.append(getDishAndTime(recipe)).append("\n");
            }
        }
        return result.toString();
    }
    
    public String find(int timeLimit) {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> recipe : orderedRecipeList) {
            if (Integer.parseInt(recipe.get(1)) <= timeLimit) {
                result.append(getDishAndTime(recipe)).append("\n");
            }
        }
        return result.toString();
    }
    
    public String findByIngredient(String ingredient) {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> recipe : orderedRecipeList) {
            boolean found = false;
            for (String part : recipe.subList(2, recipe.size())) { // Start from the third element to skip name and time
                if (part.equals(ingredient)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                result.append(getDishAndTime(recipe)).append("\n");
            }
        }
        return result.toString();
    }
}
