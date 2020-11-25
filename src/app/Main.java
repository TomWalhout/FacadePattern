package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Super Amplifier");
        Tuner tuner = new Tuner("Super Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Super DVD Player", amp);
        CdPlayer cd = new CdPlayer("Slightly terrible CD Player", amp);
        Projector projector = new Projector("Useless Projector", dvd);
        TheaterLights lights = new TheaterLights("A new set of Lights");
        Screen screen = new Screen("Nice screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        Facade facade = new Facade(amp, tuner, dvd, cd, projector, lights, screen, popper);
    }
}
