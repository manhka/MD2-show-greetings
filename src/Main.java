import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("this is the first java program, enter your name:");
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("hello "+ name);
    }
}
