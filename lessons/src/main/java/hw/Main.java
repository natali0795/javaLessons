package hw;

import lesson_3.Sotrudnik;

public class Main {

    public static void main(String[] args) {

        // Задача 4
        Sotrudnik[] array = new Sotrudnik[5];
        array[0] = new Sotrudnik("Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        array[1] = new Sotrudnik("Lida", "QA Engineer", "lida@mailbox.com", "000000000", 25000, 35);
        array[2] = new Sotrudnik("Nika", "QA Manual Engineer", "Nika@mailbox.com", "000000001", 40000, 42);
        array[3] = new Sotrudnik("Sveta", "PM", "svetan@mailbox.com", "000000002", 50000, 38);
        array[4] = new Sotrudnik("Dima", "Developer", "dima@mailbox.com", "000000003", 70000, 45);


        for (Sotrudnik sotrudnik : array) {
            if (sotrudnik.getAge() > 40) {
                System.out.println("***** Sotrudnic *****");
                sotrudnik.print();
            }
        }
    }

}
