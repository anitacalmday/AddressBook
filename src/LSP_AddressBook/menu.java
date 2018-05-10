package LSP_AddressBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class menu 
{
	File file; 
	AddressBook addressBook; 
	public AddressBook readFile(java.io.File file) throws  java.io.IOException 
	{
		ObjectInputStream out = null; 
		try {
FileInputStream fin = new FileInputStream(file);
			out  = new ObjectInputStream(fin); 
			addressBook = (AddressBook)out.readObject(); 
			out.close(); 
			return addressBook; 
		}
		catch (Exception e) {
			return null; 
		}
		
		
	//	return null;
		
		
	}
	public boolean saveFile(AddressBook addressBook, File file)
	{
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fout = new FileOutputStream(file); 
			oos = new ObjectOutputStream(fout); 
			oos.writeObject(addressBook);
			oos.close(); 
			return true; 
		}
		catch (Exception e) 
		{
			return false; 
		}
	}
	void save_as() 
	{
		
	}
	void create_new()
	{
		
	}
	void close()
	{
		
	}
	void quit()
	{
		
	}
	public menu() 
	{
		// TODO Auto-generated constructor stub
	}

}
