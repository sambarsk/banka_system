package banka_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

    }
}
