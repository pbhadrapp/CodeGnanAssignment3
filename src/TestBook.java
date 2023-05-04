public class TestBook {
public static void main(String[] args) {
	Book1 ob1 = new Book1();
	Book1 ob2 = new Book1();
	ob1.setBookId(10);
	ob1.setBookName("the great");
	ob1.setBookPrice(1200);
		System.out.println("Book1 Details");
		System.out.println(ob1.getBookId());
		System.out.println(ob1.getBookName());
		System.out.println(ob1.getBookPrice());
		ob2.setBookId(1);
		ob2.setBookName("the good");
		ob2.setBookPrice(120);
		System.out.println("Book2 Details");
		System.out.println(ob2.getBookId());
		System.out.println(ob2.getBookName());
		System.out.println(ob2.getBookPrice());	
}
}
