public class Application {
    public void run(){
        AmountOfSundays sundays = new AmountOfSundays();

        sundays.setFirstDate("01-01-2020");
        sundays.setSecondDate("01-01-2022");

        System.out.println(sundays.getAmountOfSundays());


    }
    public static void main(String[] args) {
        Application app = new Application();

        app.run();
    }
}
