public class Main {
    public static void main(String[] args) {
        /*
        Person person1 = new Person();
        person1.setAge(30);
        person1.setName("Oliwer Karlsson");
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        */
        /*
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.deposit(100000);
        bankAccount1.withdraw(5000);
        System.out.println(bankAccount1.checkBalance());
        bankAccount1.withdraw(95000);
        System.out.println(bankAccount1.checkBalance());
        bankAccount1.deposit(999);
        System.out.println(bankAccount1.checkBalance());

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.deposit(123);
        System.out.println("1: " + bankAccount1.checkBalance() + " and 2: " + bankAccount2.checkBalance());
        */
        /*
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(3);
        if (rectangle.getWidth() > 0 || rectangle.getHeight() > 0) {
            System.out.println("Area: " + rectangle.calculateArea());
        }
        */

        Student student1 = new Student();
        student1.setName("Oliwer Karlsson");
        student1.setStudentId(1337);
        student1.changeGrade(3.2);
        System.out.println(student1.getStudentId() + " " + student1.getName() + " " + student1.seeGrade());
    }
}