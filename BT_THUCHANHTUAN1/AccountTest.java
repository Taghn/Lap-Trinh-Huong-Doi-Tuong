
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Account myAccount = new Account();

        System.out.println("Ten khi chua duoc cai dat la: "+ myAccount.getName());

        System.out.println("Xin moi nhap ten ban: ");

        String theName=input.nextLine();

        myAccount.setName(theName);
        System.out.println("");

        System.out.println("Ten sau khi nhap vao la: "+ myAccount.getName());
    }    
}
