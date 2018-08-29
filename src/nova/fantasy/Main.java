package nova.fantasy;

public class Main {
    public static void main(String[] args) {

        Orc burzum = new Orc();
        Skull yorick = new Skull();
        TrustyAxe bloodAxe = new TrustyAxe();

        burzum.setTrustyAxe(bloodAxe);

        burzum.showWeapon();

        if (burzum.isCanCrush())
            yorick.setCrushed(true);
        else yorick.setCrushed(false);

        if (yorick.isCrushed()) {
            System.out.println("Da skull is crushed!");
        }
    }
}