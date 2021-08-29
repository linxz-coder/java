package academy.learnprogramming;

public class PC {
    private Case theCase; //case is a reserved keyword, so we cannot use it
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // you don't have to use getter in the class itself, access to the field directly
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
