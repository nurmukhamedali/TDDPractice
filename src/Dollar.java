public class Dollar {
    int amount;
    public Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar other = (Dollar) obj;
        return this.amount == other.amount;
    }
}
