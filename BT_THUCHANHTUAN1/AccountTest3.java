
import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {
        Account3 account1= new Account3(null, 50.0);
        Account3 account2= new Account3(null, -7.730);

        Scanner name= new Scanner(System.in);

        System.out.println("Ten khi chua duoc cai dat la: "+ account1.getName());

        System.out.print("Xin moi nhap ten ban: ");

        String theName=name.nextLine();

        account1.setName(theName);

        System.out.println("");

        System.out.println("Ten sau khi nhap vao la: "+ account1.getName());

        //account2

        System.out.println("Ten khi chua duoc cai dat la: "+ account2.getName());

        System.out.print("Xin moi nhap ten ban: ");

        theName=name.nextLine();

        account2.setName(theName);

        System.out.println("");

        System.out.println("Ten sau khi nhap vao la: "+ account2.getName());

        //check stk ban dau

        System.out.println(account1.getName()+" co so du la: "+account1.getBalance());
        System.out.println(account2.getName()+" co so du la: "+account2.getBalance());

        //run xem kqua r lam tiep 
        //cho phep nguoi dung nhap deposit 

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can nhap cho account1: ");
        double depositAccount3 = input.nextDouble();
        
        //hien thi lai noi dung can nap de ktra dung ch 

        System.out.println("Ban dang cong them account1 "+ depositAccount3);
        account1.deposit(depositAccount3);

        //check stk sau khi nap

        System.out.println(account1.getName()+" co so du la: "+account1.getBalance());
        System.out.println(account2.getName()+" co so du la: "+account2.getBalance());

        System.out.println();
        System.out.print("Nhap so can nhap cho account2: ");
        depositAccount3 = input.nextDouble();
        System.out.println("Ban dang cong them account2 "+ depositAccount3);
        account2.deposit(depositAccount3);

        System.out.println(account1.getName()+" co so du la: "+account1.getBalance());
        System.out.println(account2.getName()+" co so du la: "+account2.getBalance());

        
    }
}
