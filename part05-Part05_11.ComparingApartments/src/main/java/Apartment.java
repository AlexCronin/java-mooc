
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
        if(this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    private int price() {
        return pricePerSquare * squares;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.price() >= compared.price()) {
            return this.price() - compared.price();
        } else {
            return compared.price() - this.price();
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();

    }

}
