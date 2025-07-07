//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 40);
        h.setName("ミナト");
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        Matango m = new Matango("お化けキノコA",50);

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        System.out.println(h.getName() + "は、眠って回復した！");

        h.attack(m);
    }
}