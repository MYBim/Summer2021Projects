package Projects_09.TestClass;


import Projects_09.Lessons.LessonClass;
import Projects_09.Lessons.Music;
import Projects_09.Student.StudentClass;

public class MainClass4 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("David", "Villa", "England");

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*

        Run the MainClass4

        Result should be
         Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website

         */
    }
}




