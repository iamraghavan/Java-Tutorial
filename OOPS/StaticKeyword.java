package OOPS;

public class StaticKeyword {

    public static void main(String[] args) {

        CourseInfo courseObj = new CourseInfo();

        TutorialLogs.studentName = "Raghavan";
        courseObj.rollNo[0] = 3001;
        courseObj.CourseName = "Core Java";
        courseObj.CourseDuration = 5;

        courseObj.printStudentDetails(TutorialLogs.studentName, courseObj.rollNo[0]);
        TutorialLogs.printCourseDetails(courseObj.CourseName, courseObj.CourseDuration);

        TutorialLogs.printCourseDetails("C++", 3);

        TutorialLogs.studentName = "Sanjay";

        System.out.println(TutorialLogs.studentName);


    }

}


class TutorialLogs {

    static String studentName;
    int[] rollNo = new int[50];

    void printStudentDetails(String Name, int RollNo){
        System.out.println("Student Name : " + " " + Name);
        System.out.println("Roll No : " + " " + RollNo);
    }

    static void printCourseDetails(String CourseName, int Duration){
        System.out.println("Course Name : " + " " + CourseName);
        System.out.println("Course Duration : " + " " + Duration +  " " + "Months");
    }

}

class CourseInfo extends TutorialLogs {

    String CourseName;
    int CourseDuration;


}