public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("name");
        person1.setAge(12);
        System.out.println("Выводим значение в мейн методе"+person1.getName());
        System.out.println("Выводим значение в мейн методе"+person1.getAge());


        Person person2 = new Person();
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("you print null name");
        } else {
        name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("error");
        } else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<3; i+=1){
            System.out.println("My name "+ name + ", my age " + age + " years.");
        }
    }

    void sayHello(){
        System.out.println("Hello");
    }
}
