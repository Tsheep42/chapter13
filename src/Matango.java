public class Matango {
    private String name;
    private int hp;

    public Matango(String name , int hp) {
        this.name=name;
        this.hp=hp;
    }
    final int LEVEL = 10;
    char suffix;
    public void run() {
        System.out.println("お化けキノコA" + this.suffix + "は逃げ出した！");
    }
}
