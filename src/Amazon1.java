public class Amazon1 {
	private String name;
	private long mobilenumber;
	private String email;
	private String password;
	
	public Amazon1(String name, long mobilenumber, String email, String password) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.password = password;
	}
	public Amazon1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return name+"    "+mobilenumber+"    "+email+"      "+password+"";
	}
	
	public static class Ecommerce1 {
		public static void main(String[] args) {
			Amazon1 a1 = new Amazon1 ("SaiRam",7777766666l,"sai@hotmail.com","code@!23");
			System.out.println(a1);
			Amazon1 a2 = new Amazon1 ("Venu",9999988888l,"venus@gmail.com","secret@123#");
			System.out.println(a2);
			Amazon1 a3 = new Amazon1 ("Saketh",8888877777l,"saketh@yahoo.com","python@code");
			System.out.println(a3);
			
			
		}
		
	}
	
	}

