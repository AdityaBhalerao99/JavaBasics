package Inheritance;

public class Student {

   private int student_id;

    public Student() {
    }

    int student_name;

    int student_course;

    boolean student_status;

    public Student(int student_id, int student_name, int student_course, boolean student_status) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_course = student_course;
        this.student_status = student_status;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_name() {
        return student_name;
    }

    public void setStudent_name(int student_name) {
        this.student_name = student_name;
    }

    public int getStudent_course() {
        return student_course;
    }

    public void setStudent_course(int student_course) {
        this.student_course = student_course;
    }

    public boolean isStudent_status() {
        return student_status;
    }

    public void setStudent_status(boolean student_status) {
        this.student_status = student_status;
    }

    public int add (int a, int b){
        return a+b;
    }

}
