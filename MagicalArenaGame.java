import java.util.*;

//********************************** Blue Print of player class *********************************
class Player {
    int health;
    int strength;
    int attack;
    //****************************** Player function or method **********************************
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
}

//************************************ public class of Magical Arena Game ************************
public class MagicalArenaGame {
    static Random random = new Random();
    public static int rollDie() {
        //**************************** randon method for the die dides 1 to 6 ********************
        return random.nextInt(6) + 1;
    }
    //******************************** fight function or method **********************************
    public static void fight(Player attacker, Player defender) {
        int attackRoll = rollDie();
        int defenseRoll = rollDie();
        int attackDamage = attacker.attack * attackRoll;
        int defenseStrength = defender.strength * defenseRoll;
        int damageTaken = Math.max(0, attackDamage - defenseStrength);
        defender.health -= damageTaken;
        System.out.println("Attacker rolls " + attackRoll + ", Defender rolls " + defenseRoll);
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
        System.out.println("Defender health reduced by " + damageTaken + " to " + defender.health + "\n");
    }

    //********************************* main function or method **********************************
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("************************* MAGICAL ARENA GAME *************************");
        System.out.println("For the Player A!");
        System.err.print("Enter the health of player A: ");
        int A_health = sc.nextInt();
        System.err.print("Enter the strength of player A: ");
        int A_strength = sc.nextInt();
        System.err.print("Enter the attack of player A: ");
        int A_attack = sc.nextInt();
        System.out.println();
        System.out.println("For the Player B!");
        System.err.print("Enter the health of player B: ");
        int B_health = sc.nextInt();
        System.err.print("Enter the strength of player B: ");
        int B_strength = sc.nextInt();
        System.err.print("Enter the attack of player B: ");
        int B_attack = sc.nextInt();
        sc.close();
        Player playerA = new Player(A_health, A_strength, A_attack);
        Player playerB = new Player(B_health, B_strength, B_attack);
        while (playerA.health > 0 && playerB.health > 0) {
            if (playerA.health < playerB.health) {
                fight(playerA, playerB);   // fight method or function call
                if (playerB.health <= 0) {
                    System.out.println("Congratulation!🎉🎉 Player A Wins The Game!");
                    break;
                }
                fight(playerB, playerA);   // fight method or function call
                if (playerA.health <= 0) {
                    System.out.println("Congratulation!🎉🎉 Player B Wins The Game!");
                    break;
                }
            } else {
                fight(playerB, playerA);   // fight method or function call
                if (playerA.health <= 0) {
                    System.out.println("Congratulation!🎉🎉 Player B Wins The Game!");
                    break;
                }
                fight(playerA, playerB);   // fight method or function call
                if (playerB.health <= 0) {
                    System.out.println("Congratulation!🎉🎉 Player A Wins The Game!");
                    break;
                }
            }
        }
    }
}