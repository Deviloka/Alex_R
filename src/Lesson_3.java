public class Lesson_3 {
    public static void main(String[] args) {
        Person[] persarray = new Person[5];
        persarray[0] = new Person("Alex Test", "Engineer", "Alextest@mailbox.com", "37525452437", 1000, 25);
        persarray[1] = new Person("Alex Test2", "QAEngineer", "Alextest2@mailbox.com", "37529452584", 1200, 28);
        persarray[2] = new Person("Alex Test3", "Designer", "Alextest3@mailbox.com", "37533544284", 1500, 37);
        persarray[3] = new Person("Alex Test4", "Developer", "Alextest4@mailbox.com", "37533522548", 6500, 20);
        persarray[4] = new Person("Alex Test5", "Analyst", "Alextest5@mailbox.com", "37525458624", 2000, 33);
        for (Person employee : persarray)
            System.out.println(employee);
    }
}class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}