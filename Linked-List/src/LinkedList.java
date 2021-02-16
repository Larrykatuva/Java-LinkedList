
public class LinkedList {
	//Initialize the first child in the linked list
	private Child firstChild;
	
	
	//set the first child in the linked list to null
	public LinkedList() {
		this.firstChild = null;
	}
	
	
	/*
	 * Checking if the linked list id empty 
	 * returns: true or false
	 */
	public boolean isEmpty() {
		return this.firstChild == null;
	}
	
	
	/*
	 * Inserting at the left side of the linked list
	 * Arguments: int age, String name
	 * Return: void
	 */
	public void insertFirst(int age, String name) {
		//Creating the instance of our child and passing the argu,ents
		Child newChild = new Child(age, name);
		//newChild link --> old firtsChild link
		newChild.next = this.firstChild;
		// firstChild link --> newChild link
		this.firstChild = newChild;
	}
	
	
	/*
	 * Deleting the first Child in the linked list
	 * Returns : deleted Child
	 * Arguments : none
	 */
	public Child deletedFirstChild() {
		//Saving the reference to the Child link
		Child childToDelete = this.firstChild;
		//Delete it and set firstChild --> old next Child
		this.firstChild = this.firstChild.next;
		//Return the deleted Child
		return childToDelete;
	}
	
	/*
	 * Display Link list Elements(Children)
	 * Arguments: none
	 * Returns: none
	 */
	public void displayList() {
		System.out.print("List (first-->last): ");
		//Starting at the begining of the list
		Child currentChild = this.firstChild;
		//Looping until the end
		while(currentChild != null) {
			//printing the current child
			currentChild.displayChild();
			//Moving to the next child
			currentChild = currentChild.next;
			System.out.print(" ");
		}
	}
	
	
	/*
	 * Finding a child by name
	 * Arguments: String name
	 * Return: Found Child or null
	 */
	public Child searchChild(String name) {
		//Start at the 'first child'
		Child currentChild = this.firstChild;
		//Loop while no match
		while(!currentChild.getName().equals(name))
		// if end of list,
		if(currentChild.next == null)
		return null;
		// not end of list,
		else
		// go to next child
		currentChild = currentChild.next;
		// found it
		return currentChild;

	}
	
	
	/*
	 * Deleting child with given name
	 * Arguments: String name
	 * Returns: Child deletedChild
	 */
	public Child deleteChild(String name) {
		//If the linked list is not empty
		Child currentChild = this.firstChild;
		Child previousChild = this.firstChild;
				
		while(currentChild.equals(name))
		if(currentChild.next == null)
		// didn't find it
		return null;
		else
		// go to next Child
		previousChild = currentChild;
		currentChild = currentChild.next;
		// found it
		// if first Child,
		if(currentChild == this.firstChild)
		//change first
		this.firstChild = this.firstChild.next;
		//otherwise,
		else
		previousChild.next = currentChild.next;
		return currentChild;
	}
}
 