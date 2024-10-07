package Project_Twoelve;

import java.util.*;
import Project_Twoelve.Classess.University_Class;
import Project_Twoelve.Semester.University_Semester;
import Project_Twoelve.Student.University_Student;

public class Manage_University {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        University_Class classes = new University_Class();
        University_Semester term = new University_Semester();
        University_Student student = new University_Student();

        System.out.println();

        System.out.print("\t* WELCOME TO THE MANAGE UNIVERSITY APP *");

        System.out.println();

        boolean again = true;
        while (again) {

            System.out.println();

            System.out.println("\t 1) Add Class");
            System.out.println("\t 2) Show List Classess");
            System.out.println("\t 3) Add Student");
            System.out.println("\t 4) Show List Students and ID");
            System.out.println("\t 5) Show List Classes and Pleasses");
            System.out.println("\t 6) Show List Classes and Day of Event");
            System.out.println("\t 7) Show List Classes and Durations");
            System.out.println("\t 8) Show List Terms");
            System.out.println("\t 9) Choose Unit of Terms");
            System.out.println("\t 10) Show List Student and Unit");
            System.out.println("\t 11) Exit");

            System.out.println();

            System.out.print("\tEnter an option between 1-11 : ");
            int option = scanner.nextInt();

            System.out.println();

            switch (option) {
                case 1:
                    classes.get_name_class();
                    break;
                case 2:
                    classes.show_name_class();
                    break;
                case 3:
                    student.get_name_student();
                    break;
                case 4:
                    student.show_name_student();
                    break;
                case 5:
                    classes.show_place_class();
                    break;
                case 6:
                    classes.show_day_class();
                    break;
                case 7:
                    classes.show_time_class();
                    break;
                case 8:
                    student.show_terms();
                    break;
                case 9:
                    student.get_terms();
                    break;
                case 10:
                    student.show_stuednt_unit();
                    break;
                case 11:
                    System.out.println("\tThanks For Use Our App !");
                    again = false;
                    break;
                default:
                    System.out.println("\tThe Option is not correct !");
                    break;
            }
        }
    }
}