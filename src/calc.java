import java.util.Scanner;

public class calc {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        int num1 = nextInt();
        char operator = getOperation();
        int num2 = nextInt();
        int result = calculator(num1,num2,operator);
        System.out.println("Result: "+result);
    }

    public static int nextInt(){
        System.out.println("Print number:");
        int number;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            System.out.println("Error, try again");
            scanner.next();
            number = nextInt();
        }
        return number;
    }


    public static char getOperation(){
        System.out.println("print operation");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }   else {
            System.out.println("Error, try again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }


    public static int calculator(int num1, int num2, char operator){
        int result;
        switch (operator){
            case '+':
            result = num1+num2;
            break;
            case '-':
            result = num1-num2;
            break;
            case '*':
            result = num1*num2;
            break;
            case '/':
            result = num1/num2;
            break;
            default: System.out.println("Operation not found, try again");
            result = calculator(num1,num2,getOperation());
        }
        return result;
    }
}
