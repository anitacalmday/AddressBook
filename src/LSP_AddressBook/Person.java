package LSP_AddressBook; 

public class Person  {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone_num;

    public Person(String firstName,
                  String lastName,
                  String address,
                  String city,
                  String state,
                  String zip,
                  String phone_num) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_num = phone_num;
    }

    public String getFirstName()   { return firstName; }
    public String getLastName()    { return lastName; }
    public String getAddress()     { return address; }
    public String getCity()        { return city; }
    public String getState()       { return state; }
    public String getzip()     { return zip; }
    public String getphone_num() { return phone_num; }

    public void setFirstName  (String firstName)   { this.firstName = firstName; }
    public void setLastName   (String lastName)    { this.lastName = lastName; }
    public void setAddress    (String address)     { this.address = address; }
    public void setCity       (String city)        { this.city = city; }
    public void setState      (String state)       { this.state = state; }
    public void setzip    (String zip)     { this.zip = zip; }
    public void setphone_num(String phone_num) { this.phone_num = phone_num; }

    public void printPerson() {
        System.out.println(this.firstName + " " +
                           this.lastName + " " +
                           this.address + " " +
                           this.city + " " +
                           this.state + " " +
                           this.zip + " " +
                           this.phone_num);
    }

	void update(String add, String c, String s, String z, String pn)
	{
		address = add; 
		city = c; 
		state = s; 
		zip = z; 
		phone_num = pn; 
	}

}
