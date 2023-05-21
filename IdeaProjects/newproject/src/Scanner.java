

public class Scanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter age, name ans salary");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: "+ salary);




    }
}