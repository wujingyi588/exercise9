package exercise9;

import java.util.Scanner;

public class Practice12_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println(hexToDecimal(hex.toUpperCase()));
	}
	public static String hexToDecimal(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char hexChar = hex.charAt(i);
                if(hexChar >= '0' && hexChar <= '9'){
                    num = num * 16 + hexChar - '0';
                }else if( hexChar >= 'A' && hexChar <= 'F'){
                    num = num * 16 + hexChar - 'A' + 10;
                }else{
                    throw new Exception("HexFormatException");
                }
            }
            return "The decimal value for hex number " + hex + " is " + num;
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
@SuppressWarnings("serial")
class HexFormatException extends Exception{
    public HexFormatException(String msg){
        super(msg);
    }
}