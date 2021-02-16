
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main running");
		//Making a new list
		LinkedList children = new LinkedList();
		
		//Inserting children
		children.insertFirst(7, "Ian");
		children.insertFirst(8, "Keziah");
		children.insertFirst(5, "Kayla");
		children.insertFirst(10, "Mumo");
		children.insertFirst(6, "Esther");
		
		//Display the children list
		children.displayList();
		System.out.print("\n");
		
		//delete Child
		if(!children.isEmpty()) {
			children.deleteChild("Mumo");
		}
		
		//Display the children list
		children.displayList();
		
		//Searching by child by name
		System.out.print("\n");
		Child foundChild = children.searchChild("Ian");
		System.out.print("Got child --> ");
		if(foundChild != null) {
			foundChild.displayChild();
		}else {
			System.out.print("None");
		}
		
		//Delete until the list is empty
		System.out.print("\n");
		System.out.print("Deleting from First --> Last: ");
		while(!children.isEmpty()) {
			Child childToDelete = children.deletedFirstChild();
			childToDelete.displayChild();
			System.out.print("--> Deleted, ");
		}
		
		//Display the children list
		System.out.print("\n");
		children.displayList();
	}

}
