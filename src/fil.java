import java.util.Scanner;

public class fil {
    protected float lg;
    protected static String unite;

    public fil(){
        this.lg = 0;
        fil.unite= "cm";
    }

    public fil(float lg){
        this.lg = lg;
        fil.unite= "cm";
    }
    public fil (float lg, String unite){
        this.lg = lg;
        fil.unite= unite;
    }

    public void saisir () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur du fil : ");
        this.lg = sc.nextFloat();
    }

    public void afficher () {
        System.out.println("Longueur du fil : " + this.lg + " " + fil.unite);
    }

    public float getLg () {
        return this.lg;
    }

    public void setLg (float lg) {
        this.lg = lg;
    }

    public static String getUnite () {
        return fil.unite;
    }

    public static void setUnite (String unite) {
        fil.unite = unite;
    }

}
