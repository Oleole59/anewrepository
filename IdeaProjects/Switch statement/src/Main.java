

public class Main {
    public static void main(String[] args){
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "modetator":
                System.out.println("you are a moderater");
                break;
            case "default":
                System.out.println("you are a guest");
        }

    }
}