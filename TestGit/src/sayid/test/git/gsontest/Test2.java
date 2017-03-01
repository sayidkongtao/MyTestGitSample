package sayid.test.git.gsontest;

import java.util.Date;

import com.google.gson.Gson;

public class Test2 {

	public static void main(String[] args) {

		Gson gson = new Gson();

		Test1 student1 = new Test1();
		student1.setId(1);
		student1.setName("Sayid");
		student1.setBirthDay(new Date());
		
		String s1 = gson.toJson(student1);
		System.out.println(s1);
		
		Test1 student = gson.fromJson(s1, Test1.class);
		
	}
}
