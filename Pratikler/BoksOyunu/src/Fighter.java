public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        if (foe.isDodge()) {
            System.out.println(foe.name + " Vuruşu blokladi!");
            return foe.health;
        }
        System.out.println(this.name + " => " + foe.name + "'e " + this.damage + " hasar verdi.");
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean isDodge() {
        double random = Math.random() * 100;
        return random <= this.dodge;
    }

}
