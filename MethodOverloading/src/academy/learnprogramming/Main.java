package academy.learnprogramming;

// Method overloading: Same method, different parameters
public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        //-----test the challenge------
        double result1 = calcFeetAndInchesToCentimeters(6,3);
        double result2 = calcFeetAndInchesToCentimeters(13);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    // ----------challenge---------------
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches <=12) {
            double calcFeetToCentimeters = feet * 12 * 2.54;
            double calcInchesToCentimeters = inches * 2.54;
            double calcTotal = calcFeetToCentimeters + calcInchesToCentimeters;
            return calcTotal;
        }
        System.out.println("Invalid feet or inches parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }

}

// feet to centimeters converter: https://www.metric-conversions.org/length/feet-to-centimeters.htm
