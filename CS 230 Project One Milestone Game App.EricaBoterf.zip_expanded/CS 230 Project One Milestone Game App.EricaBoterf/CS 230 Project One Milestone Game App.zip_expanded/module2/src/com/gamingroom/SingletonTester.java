package com.gamingroom;

/**
 * A simple class to test the Singleton behavior of GameService.
 */
public class SingletonTester {

    /**
     * Prints all current games managed by GameService.
     */
    public void testSingleton() {

        System.out.println("\n--- Testing Singleton Instance ---");

        // Get the singleton instance
        GameService service = GameService.getInstance();

        // Print all existing games
        for (int i = 0; i < service.getGameCount(); i++) {
            System.out.println(service.getGame(i));
        }

        System.out.println("--- End of Singleton Test ---");
    }
}
