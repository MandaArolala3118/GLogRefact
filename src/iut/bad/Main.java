package iut.bad;
public class Main {
    public static void main(String[] args) {
		Homme homme1 = new Homme("Doe", "John", 30);
        Femme femme1 = new Femme("Doe", "Jane", 25);

        System.out.println("Homme => Nom :" + homme1.getNom() + ", Prenom :" + homme1.getPrenom() + ", Âge :" + homme1.getAge());
    
        System.out.println("Nom :" + femme1.getNom() + ", Prenom :" + femme1.getPrenom() + ", Âge :" + femme1.getAge());
    
	}
}
