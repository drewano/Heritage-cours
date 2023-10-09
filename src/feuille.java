import java.util.Scanner;
public class feuille extends fil{
    protected float lr;

    public feuille(){
        super(); //appel du constructeur de la classe mère
        this.lr = 0;
    }

    public feuille(float lg, float lr){
        super(lg); //appel du 2ème constructeur de la classe mère
        this.lr = lr;
    }

    public feuille(float lg, float lr, String unite){
        super(lg, unite); //appel du 3ème constructeur de la classe mère
        this.lr = lr;
    }

    public void saisir () {
        Scanner sc = new Scanner(System.in);
        super.saisir(); //appel de la méthode saisir de la classe mère
        System.out.println("Entrez la largeur de la feuille : ");
        this.lr = sc.nextFloat();
    }
    public void afficher () {
        super.afficher(); //appel de la méthode afficher de la classe mère
        System.out.println("Largeur de la feuille : " + this.lr);
    }
    public float surface () {
        return this.lr * this.lg;
    }
}
