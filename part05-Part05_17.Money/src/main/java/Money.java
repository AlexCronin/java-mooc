
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int addedEuros = this.euros + addition.euros;
        int addedCents = this.cents + addition.cents;
        if(addedCents > 99) {
            addedEuros++;
            addedCents = addedCents - 100;
        }
        Money newMoney = new Money(addedEuros, addedCents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        
        if( convertToCents(this) < convertToCents(compared) ) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        
        if(this.lessThan(decreaser)) {
            Money newMoney = new Money(0 , 0);
            return newMoney;
        }
        int decreasedEuros = 0;
        int decreasedCents = 0;
        
        int difference = convertToCents(this) - convertToCents(decreaser);
        
        if(difference > 100) {
            while(difference > 100) {
                decreasedEuros++;
                difference = difference - 100;
            }
        }
        
        decreasedCents = difference;
        
        Money newMoney = new Money(decreasedEuros , decreasedCents);
         
        return newMoney;
    }
    
    public int convertToCents(Money moneyObject) {
        int numEuros = moneyObject.euros;
        int numCents = moneyObject.cents;
        
        return numCents + (numEuros * 100);
    }
}
