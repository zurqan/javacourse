package course.javalearning.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MainDay2 {
    static Student[] students = new Student[]{
            Student.student("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.student("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.student("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.student("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.student("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.student("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };

    public static void main(String[] args) {
        Map<Course, List<Student>> courseGrouping = Stream.of(students)
                                                          .reduce(new HashMap<>(), MainDay2::apply, (a, b) -> a);
        System.out.println(courseGrouping);
    }

    private static HashMap<Course, List<Student>> apply(
            HashMap<Course, List<Student>> acc,
            Student st
    ) {
        st.getCourses()
          .forEach(course -> {
              if (acc.containsKey(course)) {
                  acc.get(course)
                     .add(st);
              } else {
                  ArrayList<Student> list = new ArrayList<>();
                  list.add(st);
                  acc.put(course, list);
              }
          });
        return acc;
    }
}
