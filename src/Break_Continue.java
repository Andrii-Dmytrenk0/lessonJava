public class Break_Continue {
    public static void main(String[] args) {
//        int i = 0;
//        while (true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//            i+=1;
//        }
//        System.out.println("We out of Loop");

        for(int i = 0; i <= 15; i += 1){
            if(i%2==0){
                continue;
            }
            System.out.println("is an odd number "+i);
        }
    }
}
