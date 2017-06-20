
public class node {
	private int childNum;
	private int value;
	private int key;
	
	public node(int num){
		value = num;
	}

	public int getValue() {
		return value;
	}

	public int getChild(){
		return childNum;
	}
	public void setChild(int num){
		childNum=num;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
