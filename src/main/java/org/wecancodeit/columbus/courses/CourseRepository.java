package org.wecancodeit.columbus.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	Map<String, Course> courses = new HashMap<>();

	public CourseRepository() {
		Course java = new Course("Java", "1111", "Intro to Java");
		Course javascript = new Course("Javascript", "1112", "Intro to front end");
		Course spring = new Course("Spring", "1113", "Spring platform fundamentals");

		populateCoursesMap(java, javascript, spring);
	}

	public Collection<Course> findAll() {
		return courses.values();
	}

	public CourseRepository(Course...courses) {
		
	}
	
	public void populateCoursesMap(Course...courses) {
		for(Course course : courses) {
			this.courses.put(course.getCourseId(), course);
		}
	}
	
	public Course findOne(String courseId) {
		return courses.get(courseId);
	}
}