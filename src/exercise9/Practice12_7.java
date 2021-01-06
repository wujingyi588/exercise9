package exercise9;

import java.util.Scanner;

public class Practice12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String hex = input.nextLine();
        System.out.println(bin2Dec(hex));
	}
	public static String bin2Dec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char binChar = hex.charAt(i);
                if(binChar == '1' || binChar == '0'){
                    num = num * 2 + binChar - '0';
                }else{
                    throw new Exception("NumberFormatException");
                }
            }
            return "The decimal value for binary number " + hex + " is " + num;
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
