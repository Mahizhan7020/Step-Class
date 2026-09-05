import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Overloaded draftable checks
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10; // Experienced players
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured; // Newer but fit players
    }

    // Comparable implementation (descending batting average)
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    // Draft and rank method
    static String draftAndRank(Player[] players) {
        Player[] draftable = Arrays.stream(players)
            .filter(p -> isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured))
            .toArray(Player[]::new);

        Arrays.sort(draftable); // Uses compareTo

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            sb.append((i + 1)).append(". ").append(draftable[i].name);
            if (i < draftable.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
}

public class DraftEngine {
    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(Player.draftAndRank(players));
    }
}
