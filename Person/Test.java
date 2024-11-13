package Person;

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("Nguyen Van A", "11/13/1998", "Ha Noi", 'M', "vana@gmail.com", "0123456789");

		System.out.println(person1.toString());
		Person person2 = new Person();
		person2.setName("Le Thi B");
		person2.setDob("14/05/1998");
		person2.setPob("Ho Chi Minh");
		person2.setGender('F');
		person2.setEmail("lethi.b@gmail.com");
		person2.setPhone("0987654321");

		System.out.println(person2.toString());

	}
}
