import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, select ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : " );
        number1 = input.nextInt();
        System.out.print("Enter the second number : " );
        number2 = input.nextInt();
        System.out.print("1-Plus \n2-Minus \n3-Multiply \n4-Divided");
        System.out.print("Enter the choice : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Plus :" + (number1+number2));
             break;
            case 2:
                System.out.println("Minus :" + (number1-number2));
                break;
            case 3:
                System.out.println("Multiply : " + (number1*number2));
                break;
            case 4:
                 switch (number2){
                     case 0:
                         System.out.println("A number cannot be divided by zero");
                         break;
                     default:
                         System.out.println("Divided: " + (number1 / number2));
                         break;
                 }
                break;
            default:
                System.out.println("You made a wrong selection.Try again");



        }


    }
}