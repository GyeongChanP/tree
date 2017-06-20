import java.util.ArrayList;
import java.util.Scanner;

public class treeDriver {
	static Scanner kb = new Scanner(System.in);
	static ArrayList<node> tree = new ArrayList<>();
	static int key;
	
	public static void main(String[] args){
		while(true){
			menu();
			int select = kb.nextInt();
			switch(select){
			case 1 : insert();
			     break;
			case 2 : travel();
			     break;
			case 3 : delete();
			break;
			case 4 : find();
		     break;
			case 5 : System.exit(0);
			default : System.out.println("Please re-enter.(1~3)");
			
			}
		}
		
	}
	public static void menu(){
		System.out.println("1~3번 중 선택");
		System.out.println("1 : insert");
		System.out.println("2 : travel");
		System.out.println("3 : delete");
		System.out.println("4 : find");
		System.out.println("5 : Exit\n");
		System.out.print("number : \n\n");
	}
	
	public static int insert(){
		int index = 0;
		if(tree.size()==0){
			System.out.print("input root : ");
			int input = kb.nextInt();
			tree.add(new node(input));
			tree.get(0).setKey(key++);
		} else{
		System.out.print("select root value Key : ");
		int input = kb.nextInt();
		for(int i = 0; tree.get(i).getKey()!=input; i++){
			index++;
			if(i>tree.size()){
				System.out.println("not exist");
				return 0;
			}
		}
		tree.get(index).setChild(tree.get(index).getChild()+1);
		System.out.print("insert value : ");
		int insert = kb.nextInt();
		tree.add(index+1, new node(insert));
		tree.get(index+1).setKey(key++);
		}   
		return 0;
	}
	
	public static void delete(){
		System.out.print("insert Key : ");
		int input = kb.nextInt();
		for(int i = 0; i<tree.size(); i++){
			if(tree.get(i).getKey()==input){
				tree.get(tree.size()-1).setChild(tree.get(i).getChild());
				tree.set(i, tree.get(tree.size()-1));
				tree.remove(tree.size()-1);
			}
		}
	}
	
	public static void find(){
		int count=0;
		System.out.print("find value : ");
		int input = kb.nextInt();
		for(int i = 0; i<tree.size() ;i++){
			if(tree.get(i).getValue()==input){
				System.out.println("Index : " + i);
				System.out.println("Key : " + tree.get(i).getKey());
				System.out.println("Value : " + tree.get(i).getValue());
			    System.out.println("Child number : " + tree.get(i).getChild() + "\n");
			    count++;
			}
		}
		if(count==0)
			System.out.println("not exist");
			
	}

	public static void travel(){
		for(int i = 0 ; i< tree.size() ; i++)
		System.out.println(tree.get(i).getValue() + " ");
	}
}

