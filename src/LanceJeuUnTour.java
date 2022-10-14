import java.util.Scanner;

public class LanceJeuUnTour {


    public static void main(String[] args){

       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Veuillez saisir le nom du permier Joeur :");
      //  String joeur1 = sc.nextLine();
        //System.out.println("Veuillez saisir le nom du deusiéme Joeur :");
    //    String joeur2 = sc.nextLine();

        var joeur1 = javax.swing.JOptionPane.showInputDialog("Veuillez saisir le nom du permier Joeur :");
        var joeur2 = javax.swing.JOptionPane.showInputDialog("Veuillez saisir le nom du deusiéme Joeur :");

        int scoreMax = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Veuillez saisir le score maximale à atteindre dans le jeu :"));

        new JeuUnTour(joeur1,joeur2,scoreMax);


    }
}
