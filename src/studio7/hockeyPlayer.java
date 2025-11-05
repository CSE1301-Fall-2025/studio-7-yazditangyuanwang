package studio7;

public class hockeyPlayer {

    private String name;
    private int jerseyNumber;
    private String handedness;   
    private String shootingSide;  

    private int totalGoals;
    private int totalAssists;
    private int gamesPlayed;

    public hockeyPlayer(String name, int jerseyNumber, String handedness, String shootingSide) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.handedness = handedness;
        this.shootingSide = shootingSide;
        this.totalGoals = 0;
        this.totalAssists = 0;
        this.gamesPlayed = 0;
    }
    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getHandedness() {
        return handedness;
    }

    public String getShootingSide() {
        return shootingSide;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
    public int getTotalPoints() {
        return totalGoals + totalAssists;
    }
    public void recordGame(int goals, int assists) {
        if (goals < 0 || assists < 0) {
            throw new IllegalArgumentException("Goals and assists cannot be negative.");
        }
        totalGoals += goals;
        totalAssists += assists;
        gamesPlayed++;
    }
    public String toString() {
        return String.format("%s (#%d)\nHanded: %s | Shoots: %s\nGames: %d | Goals: %d | Assists: %d | Points: %d",
                name, jerseyNumber, handedness, shootingSide, gamesPlayed,
                totalGoals, totalAssists, getTotalPoints());
    }


    //test run
    public static void main(String[] args) {
        hockeyPlayer player1 = new hockeyPlayer("Sienna Yazdi", 19, "Right", "Both");

        System.out.println("Before any games:");
        System.out.println(player1);

        player1.recordGame(2, 1);
        player1.recordGame(0, 2);
        player1.recordGame(1, 0);

        System.out.println("\nAfter 3 games:");
        System.out.println(player1);
    }
}
