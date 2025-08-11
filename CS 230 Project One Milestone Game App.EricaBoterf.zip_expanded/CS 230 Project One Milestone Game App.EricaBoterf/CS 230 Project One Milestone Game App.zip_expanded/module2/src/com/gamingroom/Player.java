package com.gamingroom;

/**
 * Player class represents an individual player in a team.
 * Inherits common fields (id, name) from Entity.
 * 
 * @author coce@snhu.edu
 */
public class Player extends Entity {

    /**
     * Constructor for Player
     * @param id Unique identifier for the player
     * @param name Name of the player
     */
    public Player(long id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
