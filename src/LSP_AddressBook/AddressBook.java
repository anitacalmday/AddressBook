package LSP_AddressBook; 

import java.io.*; 
import java.util.ArrayList; 
import java.util.List;

public class AddressBook extends Person {

	private List<Person> persons ; 
	int entries; 
	File newfile; 
	private boolean changedSinceLastSave = false; 
	public AddressBook()
	{
		persons = new ArrayList<>(); 
		entries = 0; 
	}
	public void setFile(File f)
	{
		newfile = f; 
	}
	
	public boolean getChangedSinceLastSave()
	{
		return changedSinceLastSave; 
	}
	public void setChangedSinceLastSave(boolean changedSinceLastSave)
	{
		this.changedSinceLastSave = changedSinceLastSave; 
		
	}
	
	void add_Person(String firstName,String lastName,String address,
            String city, String state, String zip, String phone) 
	{
		Person p = new Person(firstName, lastName, address, city, state, zip, phone); 
		persons.add(p); 
		setChangedSinceLastSave(true); 
		entries ++; 
		
		//contacts[entries] = p  ; 
		//entries++; 
		
	}
	
	// Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
	/*
	int haveContact(String n)
	{
		for (int i = 0;  i<entries; i++)
		{
			if (contacts[i].last_name.equals(n))
			{
				return i; 
			}
		}
		return -1;
	}*/
	// Deletes a contact with name s, if one is in the AddressBook.
	void delete_Person(int index)  throws java.lang.IllegalArgumentException
	{
		persons.remove(index); 
		setChangedSinceLastSave(true); 
		entries--;
	}  
	
	void displayInfo_mailing()
	{
		
	}
	void displayInfo_abc()
	{
		
		
	}
	

	
	
}