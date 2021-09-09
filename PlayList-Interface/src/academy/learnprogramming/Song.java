package academy.learnprogramming;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    // command + n -> override -> toString
    // used to printed the information
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
