orever-
import java.util.Scanner;

class mark {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter english out of mark");
        int A = sc.nextInt();
        
        
        System.out.println("enter hindi out of mark");
        int B = sc.nextInt();
        
        
        System.out.println("enter math out of mark");
        int C = sc.nextInt();
        
        
        
        System.out.println("enter science out of mark");
        int D = sc.nextInt();
        
        
        System.out.println("enter P.ed out of mark");
        int E = sc.nextInt();
        
        
        System.out.println("enter s.s.t out of mark");
        int F= sc.nextInt();
        
        int  G = A+B+C+D+E+F;
        double H =G/100;
        
        System.out.println("enter your english marks");
        int a = sc.nextInt();
        
        System.out.println("enter your hindi marks");
        int b = sc.nextInt();
        
        System.out.println("enter your math marks");
        int c = sc.nextInt();
        
        System.out.println("enter your science marks");
        int d = sc.nextInt();
        
        System.out.println("enter your p.ed marks");
        int e = sc.nextInt();
        
        System.out.println("enter your s.s.t marks");
        int f = sc.nextInt();
        
        float g = a+b+c+d+e+f;
        double your = g/H;
        
        System.out.print("your % ");
        System.out.println(your);
        
    }
    
}
