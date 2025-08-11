package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Singleton service for managing Game instances.
 * Ensures only one instance of GameService exists at runtime.
 * Uses Iterator pattern to search for existing games by name or ID.
 * 
 *@author coce@snhu.edu
 */
public class GameService {

    // List of all active games
    private List<Game> games = new ArrayList<>();

    // Next unique game ID
    private static long nextGameId = 1;

    // Singleton instance
    private static GameService instance = null;

    /**
     * Private constructor to prevent direct instantiation.
     */
    private GameService() {
    }

    /**
     * Returns the single instance of GameService.
     * Implements Singleton pattern.
     * 
     * @return GameService instance
     */
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Adds a new Game instance if the name is unique.
     * Uses Iterator pattern to avoid duplicates.
     * 
     * @param name Unique name of the game
     * @return Existing game if found, or newly created game
     */
    public Game addGame(String name) {
        // Look for an existing game with the same name
        for (Game g : games) {
            if (g.getName().equalsIgnoreCase(name)) {
                return g; // Return existing game
            }
        }

        // If not found, create a new game
        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    /**
     * Retrieve a game by its index (package-private for testing).
     * 
     * @param index Index of game in list
     * @return Game instance
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Retrieve a game by its ID.
     * 
     * @param id Unique ID
     * @return Game instance or null if not found
     */
    public Game getGame(long id) {
        for (Game g : games) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    /**
     * Retrieve a game by its name.
     * 
     * @param name Unique name
     * @return Game instance or null if not found
     */
    public Game getGame(String name) {
        for (Game g : games) {
            if (g.getName().equalsIgnoreCase(name)) {
                return g;
            }
        }
        return null;
    }

    /**
     * Get the number of active games.
     * 
     * @return Number of games
     */
    public int getGameCount() {
        return games.size();
    }

    /**
     * Provides an iterator for the games list.
     * Useful for traversal in other layers.
     * 
     * @return Iterator of Game
     */
    public Iterator<Game> getGames() {
        return games.iterator();
    }
}
