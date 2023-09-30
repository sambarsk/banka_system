package banka_system;

public class Texty {

    public void vyberUzivatela() {

        System.out.println("Zadaj: b - banka alebo z - zakaznik");
    }

    public void chybnyVyber() {

        System.out.println("Zadal si nespravny vstup");
    }

    public void vymazKonzolu() {

        for (int i = 0; i < 100; i++) {

            System.out.println(" ");
        }
    }

    public void zadanyZakaznik() {

        System.out.println("Prihlas sa: ");
    }
}
