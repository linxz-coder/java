package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        //player.health = 200; //you don't want others to change the player's health here, so you must use "private"
//        // in class
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth()); // 不管class怎么变，都不会被影响

    }
}
