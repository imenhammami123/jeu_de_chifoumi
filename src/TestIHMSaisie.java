import javax.swing.*;

public class TestIHMSaisie {

    public static void main(String[] args){
        IHMSaisie saisie = new IHMSaisie("toto");
        Choix choix = saisie.proposerChoix();
        System.out.println("Le choix du toto est "+choix);








    }
}
