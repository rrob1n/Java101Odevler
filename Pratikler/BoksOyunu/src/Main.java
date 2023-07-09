public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ahmet",15,120,100,20);
        Fighter fighter2 = new Fighter("Mehmet",20,85,85,40);

        Match match = new Match(fighter1,fighter2,85,100);
        match.run();
    }
}