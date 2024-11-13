public class Lesson20 {
    public static void main(String[] args) {
        HumanMan h1 = new HumanMan("Bob", 30);
        HumanMan h2 = new HumanMan("Tom", 15);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        HumanMan h3 = new HumanMan("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
        System.out.println(h1);
    }
}


class HumanMan {
    private String name;
    private int age;

    private static int countPeople;

    public HumanMan(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void printNumberOfPeople() {
        System.out.println("Number of people is "+countPeople);
    }

    public String toString(){
        return name+","+age;
    }
}