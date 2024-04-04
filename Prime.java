import java.util.Scanner;
class Prime{
    public static void main(String[] khan){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        for(p%1==0 && p%p==0){
            System.out.println("Prime Number");
        }
        else{ 
            System.out.println("Not a Prime NUmber");
        }
    }
}