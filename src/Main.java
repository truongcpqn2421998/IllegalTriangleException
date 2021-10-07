import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        int a=scanner.nextInt();
        System.out.println("b:");
        int b=scanner.nextInt();
        System.out.println("c:");
        int c=scanner.nextInt();
        try{
            Triangle test=new Triangle(a,b,c);
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
}

