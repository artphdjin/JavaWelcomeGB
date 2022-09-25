
// import java.io.File;
import java.util.Scanner;

public class Lesson_2 {
    
    public static void main(String[] args) {
        /*
         * Написать программу вычисления n-ого треугольного числа.
         */

        
        
        int treugTemp = 0;

        Scanner console = new Scanner(System.in);

        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/input.txt");
        // File income = new File(pathFile);

        String income;
        
        try{
            income = console.nextLine();
            int treugLevel = Integer.valueOf(income);

            for (int i = 1; i < treugLevel+1; i++) {
                treugTemp += i;
            }

            if(treugLevel < 1){
                System.out.println("There is no result for input < 1");
            } else {
                System.out.println(treugTemp);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        console.close();

        
            

    }
}
