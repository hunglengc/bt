package lap06;

import java.util.ArrayList;

public class b01 {
	public static void main(String[] args) {
		student st1 = new student("Nguyễn Văn Hưng", "1");
		student st2 = new student("Mai Xuân Nam", "2");
		student st3 = new student("Nguyễn Văn Huân", "3");
		student st4 = new student("Lê Thị Hương", "4");
		student st5 = new student("Phạm Văn Huỳnh", "5");
		ArrayList<student> stu = new ArrayList();
		stu.add(st5);
		stu.add(st4);
		stu.add(st3);
		stu.add(st2);
		stu.add(st1);
		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("start with Nguyễn" + stu.get(i));
			}
		}
	}
}
