package Assignments.Task;

public class InventorySystem {
	static int Total_items = 0;
	
	void addToInventory(int quantity_no) {
		Total_items += quantity_no;
		System.out.println(quantity_no +" Mouse added to Inventory");
	}
	
	void removeFromInventory(int quantity_no) {
		Total_items -= quantity_no;
		System.out.println(quantity_no +" Mouse removed to Inventory");
	}
	
	static int getTotalItems(int totalItems) {
		return Total_items;
	}
		
	public static void main(String[] args) {
		InventorySystem Is = new InventorySystem();
		System.out.println("Welcome to Mouse Inventory System\n");
		Is.addToInventory(26);
		Is.addToInventory(5);	
		System.out.println();
		Is.removeFromInventory(4);
		System.out.println();
		int ans = getTotalItems(Total_items);
		System.out.println("total items = " + ans);		
	}
}
