package verifnb;

public class Main {
    public static void main(String[] args) {
        Integer n = SaisieNombre.demanderNombre();

        if (n != null) { // si la saisie est correcte
            System.out.println("Vous avez saisi : " + n);
            PairImpair.verifier(n);
        }
    }
}

