import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Harshad harshad=new Harshad();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a int value to check.");
        try {
            int inp= scanner.nextInt();
            System.out.println(inp+" is Harshad?");
            System.out.println(harshad.check(inp));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
