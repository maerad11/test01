package api.io.object;

import java.io.Serializable;

import org.omg.CORBA.TRANSACTION_MODE;

//객체 입출력을 위한 자리를 획득해야한다
public class Student implements Serializable{
	private String name;
	private transient int score;//입출력 제한
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
