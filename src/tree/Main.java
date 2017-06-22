import tree.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
               Scanner kb = new Scanner(System.in);
               int value, key;
		while(true){
			menu();
			int select = kb.nextInt();
			switch(select){
			case 1 : System.out.print("value : ");
				 value = kb.nextInt();
                                 System.out.print("key : ");
                                 key = kb.nextInt();
                                 treeDriver.insert(value, key);
			     break;
			case 2 : treeDriver.travel();
			     break;
			case 3 : treeDriver.delete();
			break;
			case 4 : treeDriver.find();
		     break;
			case 5 : System.exit(0);
			default : System.out.println("Please re-enter.(1~3)");
			
			}
		}
		
	}
	public static void menu(){
		System.out.println("1~3¹ø Áß ¼±ÅÃ");
		System.out.println("1 : insert");
		System.out.println("2 : travel");
		System.out.println("3 : delete");
		System.out.println("4 : find");
		System.out.println("5 : Exit\n");
		System.out.print("number : \n\n");
	}
}
