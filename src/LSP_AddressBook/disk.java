package LSP_AddressBook; 
import java.io.*; 

public class disk extends java.lang.Object{
	List<AddressBook> books; 
	AddressBook addressBook; 

	//readFile reads a stored file and returns the AddressBook object stored in the file
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
	//sveFile saves an address book to a file. 
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
	
	public AddressBook openFile(File file) {
		ObjectInputStream ois = null;
		try {
			AddressBook out = null;
			FileInputStream fin = new FileInputStream(file);
			ois = new ObjectInputStream(fin);
			out = (AddressBook) ois.readObject();
			ois.close();
			return out;

		} catch (Exception e) {
			
			return new AddressBook();
		}
	}
	
}
