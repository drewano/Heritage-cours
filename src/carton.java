import java.util.Scanner;
public class carton extends feuille {
    protected float ht;

    public carton(){
        super(); //appel du constructeur de la classe mère
        this.ht = 0;
    }

    public carton(float lg, float lr, float hauteur){
        super(lg, lr); //appel du 2ème constructeur de la classe mère
        this.ht = hauteur;
    }

    public carton(float lg, float lr, float hauteur, String unite){
        super(lg, lr, unite); //appel du 3ème constructeur de la classe mère
        this.ht = hauteur;
    }

    public void saisir () {
        Scanner sc = new Scanner(System.in);
        super.saisir(); //appel de la méthode saisir de la classe mère
        System.out.println("Entrez la hauteur du carton : ");
        this.ht = sc.nextFloat();
    }
    public void afficher () {
        super.afficher(); //appel de la méthode afficher de la classe mère
        System.out.println("Hauteur du carton : " + this.ht);
    }
    public float volume () {
        return this.lr * this.lg * this.ht;
    }

    public float perimetre () {
        return 2 * (this.lr + this.lg);
    }

    public float surface () {
        return 2 * (this.lr * this.lg + this.lr * this.ht + this.lg * this.ht);
    }
}
