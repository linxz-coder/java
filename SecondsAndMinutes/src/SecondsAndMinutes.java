public class SecondsAndMinutes {

    //declare a constant with the keyword "final"
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds >= 60)) {
            return INVALID_VALUE_MESSAGE;
        }

        int newHour = minutes / 60;
        int newMinutes = minutes % 60;

        String hoursString = newHour + "h";
        if(newHour < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = newMinutes + "m";
        if(newMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return (hoursString + " " + minutesString + " " + secondsString);
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
