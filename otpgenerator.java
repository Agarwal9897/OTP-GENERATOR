import java.util.Random;
import java.util.Scanner;
class otpgenerator{
    int size;
    otpgenerator(int num)
    {
        size=num;
    }
    public Long generate_otp() 
    {
        Random random = new Random();
        String pseudo_otp="";
        Long otp;
        for(int i=0;i<size;i++ ) //To generate the otp for the given size
        {
            int one = random.nextInt(10);
            pseudo_otp=pseudo_otp+one;
        }
        otp=Long.parseLong(pseudo_otp);
        return otp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the OTP: ");
        int size = sc.nextInt();
        sc.nextLine();
        otpgenerator o1 = new otpgenerator(size);
        System.out.println(o1.generate_otp());
        
    }   
}