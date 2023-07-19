package market.member;

public class Person {
//�ʵ� �����
	String name;
	int phone;
	String address;

//������ ����� 2�� (name, phone) (name, phone, address)

//�޼ҵ� �����ϱ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}
}