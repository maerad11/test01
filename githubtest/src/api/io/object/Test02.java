package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File target = new File("files", "student.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream obj = new ObjectInputStream(buffer);

//		obj.readObject();

		Student s = (Student) obj.readObject();

		obj.close();
		System.out.println(s.getName());
		System.out.println(s.getScore());

	}

}
