package api.io.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		객체 출력
//		-준비물 :파일,객체,스트림 3종세트
		
		Student s = new Student("홍길동",50);
		
		File target = new File("files","student.txt");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
//		[프로그램]->obj->buffer->out->target->[student.txt]
		
		obj.writeObject(s);
		
		obj.flush();
		obj.close();
		
		
	}

}
