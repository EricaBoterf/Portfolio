package com.gamingroom;

/**
 * Application start-up program.
 * Demonstrates the Singleton pattern for GameService and 
 * shows adding Games, Teams, and Players.
 * 
 * Author: 
 */
public class ProgramDriver {

    /**
     * The one-and-only main() method.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Obtain reference to the singleton instance
        GameService service = GameService.getInstance();

        System.out.println("\n=== Initializing Game Data ===");

        // Add two games
        Game game1 = service.addGame("Draw It or Lose It");
        System.out.println("Created: " + game1);

        Game game2 = service.addGame("Draw It or Lose It"); // Duplicate name test
        System.out.println("Attempted duplicate, returned: " + game2);

        // Add teams to game1
        Team teamA = game1.addTeam("Team Alpha");
        Team teamB = game1.addTeam("Team Beta");

        System.out.println("\nTeams added to Game 1:");
        System.out.println(teamA);
        System.out.println(teamB);

        // Add players to teamA
        teamA.addPlayer("Alice");
        teamA.addPlayer("Bob");

        // Add players to teamB
        teamB.addPlayer("Charlie");
        teamB.addPlayer("Diana");

        // Display full game structure
        System.out.println("\n=== Current Game Structure ===");
        System.out.println("Game: " + game1.getName());
        System.out.println("Teams:");
        for (Team t : game1.getTeamsAsList()) {
            System.out.println("  " + t.getName() + " -> Players: " + t.getPlayersAsList());
        }

        // Confirm Singleton
        GameService anotherService = GameService.getInstance();
        System.out.println("\nGameService same instance check: " + (service == anotherService));
    }
}
