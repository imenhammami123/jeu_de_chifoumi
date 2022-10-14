public class Joeur {
    private String nom;
    private int score = 0;
    private IHMSaisie saisie;

    public Joeur(String nom) {
        this.nom = nom;
        saisie= new IHMSaisie(nom);
    }
    public void crediter(){
         score++;
    }

    public Choix choisir(){
        return saisie.proposerChoix();
    }

    public int getScore(){
        return score;
    }
    public void ecrireScore(){
        System.out.println("Le score de "+nom+" est "+score);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
}
