
import java.util.ArrayList;


public class PointList {
    
    private ArrayList<Integer> points;
    
    public PointList() {
        this.points = new ArrayList<>();
    }
    
    public ArrayList<Integer> getPointList() {
        return this.points;
    }
    
    public void add(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }
    
    public double pointAverage() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        double avg = (1.0 * sum) / points.size();
        return avg;
    }
    
    public double pointAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int point : list) {
            sum += point;
        }
        double avg = (1.0 * sum) / list.size();
        return avg;
    }
    
    public ArrayList<Integer> passedList() {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int point : points) {
            if (point >= 50) {
                passed.add(point);
            }
        }
        return passed;
    }
    
    public double pointAverageforPassed() {
        return pointAverage(passedList());
    }
    
    public double passPercentage() {
        double passPercentage = (1.0 * (passedList().size()) / points.size()) * 100;
        return passPercentage;
    }
    
    
    
}
