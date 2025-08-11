
public class Entity {

}
package com.gamingroom;

/**
 * Abstract base class for all entities in the game.
 * Provides common attributes (id and name) and behavior.
 * 
 * This class will be extended by Game, Team, and Player.
 * 
 * Author:
 */
public abstract class Entity {

    private long id;       // Unique identifier
    private String name;   // Name of the entity

    /**
     * Constructor for Entity
     * @param id Unique identifier
     * @param name Name of the entity
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
