import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisinin kaç adımını yazdırmak istiyorsunuz? ");
        int n = input.nextInt();

        int num1 = 0,num2 =1;

        System.out.println("FİBONACCİ SERİSİ \n" + num1 + ",\n," + num2);

        for(int i = 2;i<n;i++){
            int next=num1+num2;
            System.out.println(", "+next);
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }
}
