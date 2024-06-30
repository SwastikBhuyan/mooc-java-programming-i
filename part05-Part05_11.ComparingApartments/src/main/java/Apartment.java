
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int price() {
        return (this.squares * this.pricePerSquare);
    }

    public int priceDifference(Apartment compared) {
        int diff = this.price() - compared.price();

        if (this.price() >= compared.price()) {
            return diff;
        } else {
            return -1 * diff;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price() > compared.price()) {
            return true;
        }
        return false;
    }
}
