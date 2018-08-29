package nova.fantasy;

public class Orc {
    private TrustyAxe rustyAxe;
    private boolean canCrush = false;


    boolean isCanCrush() {
        return canCrush;
    }

    Orc() {
        rustyAxe = null;
    }


    void setTrustyAxe(TrustyAxe currentAxe) {
        rustyAxe = currentAxe;
    }

    void showWeapon() {
        System.out.println("MY AXE WILL STRIKE " + rustyAxe.getTrusty() + "!");
        if (rustyAxe.getTrusty())
            canCrush = true;
        else canCrush = false;
    }


    public void crushDemSkullz() {


    }

}