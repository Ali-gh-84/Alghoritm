package Project_Twoelve.Student;

import java.util.*;

public class University_Student {

    Scanner scanner = new Scanner(System.in);

    ArrayList<String> full_name_student = new ArrayList<>();
    HashMap<String, Integer> name_id_student = new HashMap<>();
    ArrayList<String> unit = new ArrayList<>();
    HashMap<String, ArrayList<String>> set_unit = new HashMap<>();

    int count1 = 1;
    int count2 = 1;

    public void get_name_student() {

        System.out.print("\t Please Enter Full Name : ");
        String name_student = scanner.nextLine();

        int id_student = (int) (Math.random() * 101);
        System.out.println("\tYour Uniqe Student Number is : " + id_student);

        name_id_student.put(name_student, id_student);
        full_name_student.add(name_student);

        System.out.println("\tStudent added successfully");
    }

    public void show_name_student() {

        System.out.println("\tList Student and ID as follows :");
        for (Map.Entry<String, Integer> show_all_students : name_id_student.entrySet()) {
            System.out
                    .println("\t" + count1 + ") " + show_all_students.getKey() + " Uniqe ID : "
                            + show_all_students.getValue() + " .");
            count1 += 1;
        }
    }

    public void show_terms() {
        System.out.println("\tName Lessons and Unit : ");
        unit.add("Mathes");
        unit.add("Persian");
        unit.add("English");
        for (int i = 0; i < unit.size(); i++) {
            System.out.println("\t" + (i + 1) + ") " + unit.get(i) + " : " + "this lesson 7 unit.");
        }
    }

    public void get_terms() {

        String find_name = null;
        boolean again = false;

        System.out.print("\tEnter Name Of Student For Search : ");
        String search_name = scanner.nextLine();

        for (Map.Entry<String, Integer> loop_name : name_id_student.entrySet()) {
            if (loop_name.getKey().equals(search_name)) {
                find_name = search_name;
                again = true;
                break;
            }
        }
        if (!again) {
            System.out.println("\tStudnet Not Found!");
            return;
        }

        ArrayList<String> les = new ArrayList<>();
        String object = "";

        while (les.size() < 2) {

            System.out.print("\tEnter Number Lesson : { 1) Mathes , 2) Persian , 3) English } :");
            int get_unit = scanner.nextInt();
            scanner.nextLine();

            switch (get_unit) {
                case 1:
                    object = "Mathes";
                    break;
                case 2:
                    object = "Persian";
                    break;
                case 3:
                    object = "English";
                    break;
                default :
                    System.out.println("\tPlease Enter valid Number !");
                    continue;
            }
            if (!les.contains(object)){
                les.add(object);
                System.out.println("\tYou Choose " + object + " and 7 unit");
                set_unit.put(find_name , les);
                break;
                
            }else {
                System.out.println("\tYou Cannot choose them !");
            }
            if (les.size() >= 2){
                System.out.println("\tYour unit is Full !");
                break;
            }
        }
    }

    public void show_stuednt_unit() {

        System.out.println("\tList Student and Unit as follows :");

        for (Map.Entry<String, ArrayList<String>> show_all_students_unit : set_unit.entrySet()) {
            System.out
                    .print("\t" + count2 + ") " + show_all_students_unit.getKey() + " Unit : ");
                    for (var lessons : show_all_students_unit.getValue()) {
                        System.out.print(
                            lessons + " ."
                        );
                    }
                    System.out.println();
            count2 += 1;
        }
    }
}
