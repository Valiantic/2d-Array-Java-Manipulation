import java.util.Scanner;

import javax.security.auth.Subject;

class irregstudents {
    public static void main(String[] args) {
        String irreg[][] = {
                { "Borg", "Justin", "Luley" },
                { "Garry", "Robert", "Ken" },
                { "Obet", "Jules", "Ellie" }
        };
        for (int i = 0; i < irreg.length; i++) {
            System.out.println();
            for (int j = 0; j < irreg.length; j++) {
                System.out.print(irreg[i][j] + " ");
            }
        }
    }
}

public class Array_twod {

    static void students() {
        String students[][] = { { "Leian", "Gard", "Barry" },
                { "Thomas", "Shamus", "Ken" },
                { "Yoru", "Rubert", "Jackie" }
        };
        for (int i = 0; i < students.length; i++) {
            System.out.println();
            for (int j = 0; j < students.length; j++) {
                System.out.print(students[i][j] + " ");
            }
        }
    }

    static void prof() {
        String prof[][] = { { "Lyndon", "Anna", "Lorz" },
                { "Ron", "Marlou", "Richard" },
                { "Jelissa", "Rocky", "Regene" }
        };
        for (int i = 0; i < prof.length; i++) {
            System.out.println();
            for (int j = 0; j < prof.length; j++) {
                System.out.print(prof[i][j] + " ");
            }
        }
    }

    static void subjects() {
        String subjects[][] = { { "COS50", "DCIT50", "GNED04" },
                { "GNED07", "GNED14", "GNED11" },
                { "STS", "MMW", "TCW" }
        };
        for (int i = 0; i < subjects.length; i++) {
            System.out.println();
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        irregstudents Irregclass = new irregstudents();

        System.out.println("Select database to display");
        System.out.println("");
        System.out.println("[1] Students");
        System.out.println("[2] Professors");
        System.out.println("[3] Subjects");
        System.out.println("[4] Irregular Students");
        int choice = scan.nextInt();
        System.out.println("");

        while (true) {

            switch (choice) {
                case 1:
                    students();
                    return;
                case 2:
                    prof();
                    return;
                case 3:
                    subjects();
                    return;
                case 4:
                    Irregclass.main(args);
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }

    }
}
