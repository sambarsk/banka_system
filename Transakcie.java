package banka_system;

public class Transakcie {

    private double zostatok;
    public Transakcie(double zostatok) {

        this.zostatok = zostatok;
    }

    public void vklad(double hodnota) {

        zostatok +=hodnota;
    }

    public void vyber(double hodnota) {

        zostatok -=hodnota;
    }

    public double getZostatok() {

        return zostatok;
    }
}
