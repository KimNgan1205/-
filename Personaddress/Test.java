package Personaddress;

public class Test {
	public static void main(String[] args) {
		Address dc1 = new Address("1", " Le Hong Phong", " Phu Ly", " Ha Nam");
		Nhanvien nv1 = new Nhanvien("Nhan", dc1, "avas", 'N');
		System.out.println("Nhan vien 1 " + nv1.toString());
		Address dc2 = new Address();
		dc2.setThon("fsdf");
		dc2.setXa("weff");
		dc2.setHuyen("dfdf");
		dc2.setTinh("sddsf");
		System.out.println("dia chi la" + dc2.toString());

	}

}