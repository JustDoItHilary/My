
package com.example.testkryo;

import java.io.Serializable;
import java.util.List;

import org.msgpack.annotation.MessagePackMessage;

//Msgpack需要注释
@MessagePackMessage
public class Student implements Serializable{

	private static final long serialVersionUID = -2060550357305407661L;

	private Integer id;
	
	private String name;
	
	private String city;
	
	private List<Student> lovers;

	public Student(){}
	
	
	public Student(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	

	public Student(Integer id, String name, String city, List<Student> lovers) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.lovers = lovers;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public List<Student> getLovers() {
		return lovers;
	}


	public void setLovers(List<Student> lovers) {
		this.lovers = lovers;
	}


	@Override
	public String toString() {
		return "Student [city=" + city + ", id=" + id + ", lovers=" + lovers
				+ ", name=" + name + "]";
	}

	
	
	
	
	
}
