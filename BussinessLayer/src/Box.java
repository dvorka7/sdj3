
public class Box {
	private String itemName;
	private String itemType;
	
	public Box(String itemName, String itemType){
		this.itemName = itemName;
		this.itemType = itemType;
	}
	
	public String getName(){
		return itemName;
	}
	//leonard je vymasteny kokot
	public String getType(){
		return itemType;
	}
}