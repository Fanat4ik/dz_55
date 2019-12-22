package ru.geekbrains.DZ;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Oleg Seredkin", "Manager", "olegs@mailbox.com", "898512333", 35000, 24 );
        persArray[2] = new Person("Viktor Bobrov", "Teacher", "viktorb@mailbox.com", "8712432243", 41000, 51);
        persArray[3] = new Person("Nikita Proskyn", "Violinist", "nikitap@mailbox.com", "898233553", 76000, 43 );
        persArray[4] = new Person("Tamara Veniavsk", "Writer", "tamarav@mailbox.com", "891635743", 45000, 32 );

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                System.out.println(persArray[i].toString());
            }

        }

    }
}
