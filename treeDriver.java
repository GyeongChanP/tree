import java.util.ArrayList;
import java.util.Scanner;

public class treeDriver {
	static Scanner kb = new Scanner(System.in);
	static ArrayList<node> tree = new ArrayList<>();
	
	public int insert(int value, int key){
		int index = 0;
		if(tree.size()==0){
			tree.add(new node(value));
			tree.get(0).setKey(key);
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
		tree.add(index+1, new node(value));
		tree.get(index+1).setKey(key);
                tree.get(index+1).setPKey(input);
		}   
		return 0;
	}
	
	public void delete(){
		System.out.print("insert Key : ");
		int input = kb.nextInt();
		for(int i = 0; i<tree.size(); i++){
			if(tree.get(i).getKey()==input){
				tree.get(tree.size()-1).setChild(tree.get(i).getChild());
				tree.set(i, tree.get(tree.size()-1));
				tree.remove(tree.size()-1);
                                break;
			}
                for(int j = tree.size()-1; j>0 ; j--){
                        if(tree.get(j).getkey()==tree.get(i).getPkey()){
                                tree.get(j).setChild(tree.get(j).getChild()-1);
                                break;
                                }
                        }
		}
	}
	
	public void find(){
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

	public void travel(){
		for(int i = 0 ; i< tree.size() ; i++)
		System.out.println(tree.get(i).getValue() + " ");
	}
}

