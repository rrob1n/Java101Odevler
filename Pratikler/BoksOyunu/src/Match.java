import java.util.Random;

public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minimumWeight;
    int maximumWeight;

    public Match(Fighter fighter1, Fighter fighter2, int minimumWeight, int maximumWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
    }

    public void run() {
        int round = 1;
        if (isCheck()) {

            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("------" + round + ".ROUND-----");
                round++;
                int vuran = ilkVuran();
                if (vuran == 0) {
                    System.out.println("Ilk vuran oyuncu : " + this.fighter1.name);
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    displayRemainingHealth(fighter2);
                    if (isWinner()) {
                        break;
                    }
                    System.out.println("Sonraki vuran oyuncu : " + this.fighter2.name);
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    displayRemainingHealth(fighter1);
                    if (isWinner()) {
                        break;
                    }
                } else {
                    System.out.println("Ilk vuran oyuncu : " + this.fighter2.name);
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    displayRemainingHealth(fighter1);
                    if (isWinner()) {
                        break;
                    }
                    System.out.println("Sonraki vuran oyuncu : " + this.fighter1.name);
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    displayRemainingHealth(fighter2);
                    if (isWinner()) {
                        break;
                    }

                }

            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor!");
        }
    }

    public boolean isCheck() {
        return (this.fighter1.weight >= minimumWeight && this.fighter1.weight <= maximumWeight) &&
                (this.fighter2.weight >= minimumWeight && this.fighter2.weight <= maximumWeight);
    }

    public int ilkVuran() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public void displayRemainingHealth(Fighter fighter) {
        System.out.println(fighter.name + " kalan can : " + fighter.health);
    }

    public boolean isWinner() {
        if (this.fighter1.health == 0) {
            System.out.println(this.fighter2.name + " Dövüşü kazandi!");
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println(this.fighter1.name + " Dövüşü kazandi!");
            return true;
        }
        return false;
    }
}
