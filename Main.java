package banka_system;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection spojenie = DriverManager.getConnection("jdbc:mysql://localhost:3306/banka_server", "root", "root");
        Statement prikaz = spojenie.createStatement();

        Scanner skener = new Scanner(System.in);
        Texty text = new Texty();

        int uzivatel = 0;

        while (uzivatel == 0) {

            text.vyberUzivatela();
            String vstup = skener.nextLine();
            System.out.println("Zadal si: " + vstup);

            if (vstup.equals("b")) {

                uzivatel = 1;
            } else if (vstup.equals("z")) {

                uzivatel = 2;
            }
            else {

                text.vymazKonzolu();
                text.chybnyVyber();
            }
        }
        text.vymazKonzolu();
        text.prihlasenieID();

        int kontrolaPrihlasenia = 0;

        if (uzivatel == 2) {

            String vstupID = skener.nextLine();
            text.prihlasenieHeslo();
            String vstupHeslo = skener.nextLine();

            text.vymazKonzolu();

            String kontrolaPrihlaseniaSQL = "SELECT * FROM zakaznik WHERE id = ? AND heslo = ?";
            PreparedStatement preparedStatement = spojenie.prepareStatement(kontrolaPrihlaseniaSQL);
            preparedStatement.setInt(1, Integer.parseInt(vstupID));
            preparedStatement.setString(2, vstupHeslo);

            ResultSet odpoved = preparedStatement.executeQuery();

            if (odpoved.next()) {

                System.out.println("Správne heslo.");
                kontrolaPrihlasenia = 1;
            }

            else {

                System.out.println("Zlé heslo alebo ID.");
            }

            if (kontrolaPrihlasenia == 1) {

                while (true) {

                    text.spravneHeslo();

                    String moznosti = skener.nextLine();

                    if (moznosti.equals("koniec")) {

                        text.vymazKonzolu();
                        text.koniec();
                        break;
                    }

                    if (moznosti.equals("vklad")) {
                        double zostatok = odpoved.getDouble("zostatok");
                        Transakcie transakcieVklad = new Transakcie(zostatok);

                        text.vklad();
                        String vklad = skener.nextLine();

                        transakcieVklad.vklad(Double.parseDouble(vklad));
                        String zmenaVklad = "UPDATE zakaznik SET zostatok = ? where id = ?";
                        PreparedStatement preparedStatement2 = spojenie.prepareStatement(zmenaVklad);

                        preparedStatement2.setDouble(1, transakcieVklad.getZostatok());
                        preparedStatement2.setInt(2, Integer.parseInt(vstupID));
                        int pocetRiadkov = preparedStatement2.executeUpdate();
                        System.out.println("Aktuálny zostatok na účte: " + transakcieVklad.getZostatok());
                    }
                }
            }
        }
    }
}
