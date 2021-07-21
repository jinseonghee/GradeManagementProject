package school;

import java.util.ArrayList;

public class School {

    private static School instance = new School();//학교라는 객체는 하나이기 때문에 singleton pattern으로 만듬

    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();

    private School() { //밖에선 이 학교를 만들 수 없게 default Constructorprivate으로 만듬

    }

    public static School getInstance() { //싱글톤 패턴

        if(instance == null)
            instance = new School();

        return  instance;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }
}
