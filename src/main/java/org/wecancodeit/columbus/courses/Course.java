package org.wecancodeit.columbus.courses;

public class Course {

	private String id;
	private String name;
	private String description;

	Course(String name, String id, String description) {
		this.name = name;
		this.id = id;
		this.description = description;
	}
	
	public String getCourseName() {
		return name;
	}
	
	public String getCourseId() {
		return id;
	}
	
	public String getCourseDescription() {
		return description;
	}

//	@Override
//	public String toString() {
//		return courseName + " " + courseId + " " + courseDescription;
//	}
}
