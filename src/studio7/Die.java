package studio7;

public class Die {

    private int sides;

    public Die(int side){
        this.sides=side;
    }

    public int getSides(){
        return this.sides;
    }

    public int roll(){
        return (int)(Math.random()*this.sides)+1;
    }

    //test run
    public static void main(String[] args) {
        Die die = new Die(6);
        System.out.println("Number of sides: " + die.getSides());
        System.out.println("Rolling the die: " + die.roll());
    }
}
