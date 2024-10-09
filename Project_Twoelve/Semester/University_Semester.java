package Project_Twoelve.Semester;

import java.util.*;
import Project_Twoelve.Classess.University_Class;
import Project_Twoelve.Student.University_Student;

public class University_Semester {

    public void average_students (){

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> average_student = new HashMap<>();  
        ArrayList<Integer> score = new ArrayList<>();
        University_Student student_term = new University_Student();

        boolean again = false;
        String find_name = null;

        int count = 1;

        System.out.print("\tPlese Choose any Way For Search Student -> 1) by Name 2) by ID : ");
        int choose_way = scanner.nextInt();
        scanner.nextLine();

        if (choose_way == 1) {

            System.out.print("\tPlese Enter Your Name For Search : ");
            String search_name = scanner.nextLine();

            for (Map.Entry<String, Integer> loop_name : student_term.get_name_id_student().entrySet()) {
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

        }else if (choose_way == 2) {

            System.out.print("\tEnter ID Of Student For Search : ");
                int search_id = scanner.nextInt();
                scanner.nextLine();

                for (Map.Entry<String , Integer> loop_id : student_term.get_name_id_student().entrySet()){
                    if (loop_id.getValue().equals(search_id)){
                        find_name = loop_id.getKey();
                        again = true;
                        break;
                    }
                }
                if(!again){
                    System.out.println("\tStudent Not Found!");
                    return;
                }
        }else {
            System.out.println("\tNumber isnot True!");
        }

        student_term.show_stuednt_unit();
        System.out.println();

        for (int i = 0; i < student_term.get_set_unit().size(); i++) {
            System.out.println("\tEnter Score of Lesson " + (i+1) + " : ");
            score.add(scanner.nextInt());
        }

        double sum = 0;
        for(double s : score){
            sum += s;
        }
        double average = sum / student_term.get_set_unit().size();

        average_student.put(find_name , (int)average);

        if (average > 14){
            System.out.println("\t* Well Done * You Pass The Exam");
            return;
        }else{
            System.out.println("\t* Sorry * You Failded The Exam!");
            return;
        }
    }

    public void show_student_average (){

        System.out.println("\tList Student and Average as follows :");

        for (Map.Entry<String, Integer> show_all_stuent_average : average_student.entrySet()) {
            System.out.println("\t" + count + ") " + show_all_stuent_average.getKey() + " average is : " + show_all_stuent_average.getValue());
            count += 1;
        }
    }
}
