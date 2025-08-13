import java.util.*;

public class Q01{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = Sc.nextLine();
        System.out.println("Enter your salary");
        double sal = Sc.nextDouble();
        System.out.println("Name= "+name+" Salary= "+sal);
        Sc.close();
    }
}

