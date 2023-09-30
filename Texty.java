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

    public void prihlasenieID() {

        System.out.println("Prihlas sa: ");
        System.out.println("Zadaj id");
    }

    public void prihlasenieHeslo() {

        System.out.println("Zadaj heslo");
    }

    public void spravneHeslo() {

        System.out.println("Moznosti: vklad/vyber/zmenaHesla");
    }
}
