import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        // Testing
        MatchManager.createMatch(new Match(0, "Norway", 0, "Sweden", 0, null, Status.NOT_STARTED));
        MatchManager.createMatch(new Match(0, "Brazil", 0, "Germany", 0, null, Status.NOT_STARTED));
        
        if (!MatchManager.startMatch(20)) {
            System.out.println("Unable to find match with ID: " + 20);
        }
        
        System.out.println("Inactive matches:");
        MatchManager.printInactiveMatches();
        System.out.println("Active matches:");
        MatchManager.printActiveMatches();
    }
}
