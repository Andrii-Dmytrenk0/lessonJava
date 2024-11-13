public class Lesson23 {
    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1+string2+string3;
//        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());System.out.printf("String %.2f \n", 532.66576);

    }
}
