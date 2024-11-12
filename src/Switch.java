import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age");
        String age = scanner.nextLine();
        switch(age){
            case "zero" :
                System.out.println("Ты родился");
                break;
            case "seven" :
                System.out.println("Ты пошел в школу");
                break;
            case "eighteen" :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");
        }

    }
}
