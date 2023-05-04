public class TestPerson {

	public static void main(String[] args) {
		Person ob1 = new Person();
		Person ob2 = new Person();
		ob1.setAge(20);
		ob1.setName("bhadra");
		ob1.setPrice(12.23f);
		System.out.println("Person1 Details");
		System.out.println(ob1.getAge());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice());

		ob2.setAge(10);
		ob2.setName("sai");
		ob2.setPrice(12.33f);
		System.out.println("Person2 Details");
		System.out.println(ob2.getAge());
		System.out.println(ob2.getName());
		System.out.println(ob2.getPrice());


	}

}
