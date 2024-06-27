# Magical Arena Game

The **Magical Arena Game** is a Java-based text game where two players battle against each other until one's health drops to zero.

## Game Overview

<p align="justify">In the Magical Arena Game, two players, Player A and Player B, engage in a battle using their unique attributes: health, strength, and attack power. The game simulates turns where each player alternates attacking the other. The outcome of each attack is determined by the attacker's attack power and a random die roll, while the defender's strength mitigates some of the damage. The game ends when one player's health is reduced to zero or below, declaring the other player as the winner.</p>

## Game Mechanics

- **Player Attributes:**
  - **Health:** Represents the player's life points. When a player's health drops to zero, they lose the game.
  - **Strength:** Influences the defense against incoming attacks.
  - **Attack:** Determines the base damage inflicted on the opponent during an attack.

- **Combat Resolution:**
  - Each player takes turns attacking.
  - Attack damage is calculated as `attack * rollDie()`, where `rollDie()` generates a random number from 1 to 6.
  - Defense strength reduces the incoming attack damage.
  - After each attack, the game displays the outcome, including damage dealt and the defender's remaining health.

- **Victory Condition:**
  - The game continues until one player's health drops to zero or below.
  - The player whose opponent's health drops to zero first is declared the winner.

## How to Play

1. **Setup:**
   - Ensure you have Java installed on your computer to run the game.
   - Download or clone the `MagicalArenaGame.java` file to your local machine.

2. **Compile and Run:**
   - Open a terminal or command prompt.
   - Navigate to the directory containing `MagicalArenaGame.java`.
   - Compile the Java file using the command:
     ```
     javac MagicalArenaGame.java
     ```
   - Run the compiled program with:
     ```
     java MagicalArenaGame
     ```

3. **Gameplay:**
   - Follow the prompts to input the attributes for Player A (health, strength, attack) and then for Player B.
   - The game will simulate each turn, displaying attack details and current health after each attack.
   - Continue until one player's health drops to zero.
   - The game will declare the winner and end.

4. **Enjoy the Magic:**
   - Experience the thrill of strategic combat in the magical arena.
   - Experiment with different attribute combinations to see how they affect gameplay outcomes.

---

<p align="justify">This README.md file provides a comprehensive guide on the game's mechanics, how to set up and run the game, and what to expect during gameplay. Adjust and expand it further based on additional features or details specific to your implementation.</p>