package banka_system;

public class Texty {

    public void vyberUzivatela() {

        System.out.println("Zadaj: b - banka alebo z - zakaznik");
    }

    public void chybnyVyber() {

        System.out.println("Zadal si nespravny vstup");
    }

    public void chybnyVyberZakaznik() {

        System.out.println("Zadal si nespravny vyber procesu");
    }

    public void kontrolaHeslo() {

        System.out.println("Zadaj stare heslo: ");
    }

    public void noveHeslo() {

        System.out.println("Zadaj nove heslo: ");
    }

    public void infoZmenaHesla() {

        System.out.println("Zmenil si si heslo");
    }

    public void enter() {

        System.out.println("Stlac enter...");
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

        System.out.println("Moznosti: info/vklad/vyber/zmenaHesla/koniec");
    }

    public void vklad() {

        System.out.println("Zadaj hodnotu, ktoru chces vlozit: ");
    }

    public void vyber() {

        System.out.println("Zadaj hodnotu, ktoru chces vybrat: ");
    }

    public void zostatok() {

        System.out.println("Tvoj zostatok: ");
    }

    public void vypisInfo(int id, String meno, String priezvisko, double zostatok) {

        System.out.println("ID: " + id);
        System.out.println("Meno: " + meno);
        System.out.println("Priezvisko: " + priezvisko);
        System.out.println("Zostatok: " + zostatok);
    }

    public void koniec() {

        System.out.println("Ukoncujem proces");
    }
}
