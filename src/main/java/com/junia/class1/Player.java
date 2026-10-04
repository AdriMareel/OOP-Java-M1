package com.junia.class1;

public class Player {

    public String name;
    public int level;
    public int health;
    public int experience;

    public Player(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Player name cannot be empty");
        }

        this.name = name;
        this.level = 1;
        this.health = 100;
        this.experience = 0;
    }

    public void takeDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException(
                    "Damage must be positive");
        }

        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Healing amount must be positive");
        }

        health += amount;

        if (health > 100) {
            health = 100;
        }
    }

    public void gainExperience(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Experience must be positive"
            );
        }

        experience += amount;

        if (experience >= 100) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        experience = 0;

        System.out.println(
                name + " leveled up! New level: " + level
        );
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }
}
