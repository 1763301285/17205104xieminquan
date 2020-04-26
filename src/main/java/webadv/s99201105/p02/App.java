package webadv.s99201105.p02;

import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	private static String Sys_account = "123456";
	private static String Sys_password = "abc";
	private static String hex_password = sha256hex(Sys_password);
	
	public static void main(String[] args) {
//        if (args.length < 1) {
//            System.err.println("Please provide an input!");
//            System.exit(0);
//        }
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an account:");      
        String account = input.nextLine();
        System.out.println("Please input an password:");
        String password = input.nextLine();
//      System.out.println(sha256hex(password));
        System.out.println(result(account,password));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
    public static boolean result(String account, String password) {
    	String hex = sha256hex(password);    	
    	if(account.equals(Sys_account)&&hex.equals(hex_password))
    		return true;
    	else
    		return false;
    }

}
