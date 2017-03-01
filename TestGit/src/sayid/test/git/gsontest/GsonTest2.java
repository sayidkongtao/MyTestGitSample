package sayid.test.git.gsontest;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
				.enableComplexMapKeySerialization()
				.serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS")
				.setPrettyPrinting()
				.disableHtmlEscaping()
				.create();
		
		Student student1 = new Student();
        student1.setId(1);  
        student1.setName("Sayid<");  
        student1.setBirthDay(new Date());
        String s1 = gson.toJson(student1);
        System.out.println("简单Bean转化为Json===" + s1);
        
	}

}
