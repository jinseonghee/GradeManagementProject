package school;

import java.util.ArrayList;

public class School {

    private static School instance = new School();//학교라는 객체는 하나이기 때문에 singleton pattern으로 만듬
                                                  //전역 객체변수로 사용하기 위해 static 객체변수로 생성

    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();

    private School() { //밖에선 이 학교를 만들 수 없게 default Constructor를 private으로 만듬

    }

    //getInstance 메서드를 통해 한번만 생성된 객체를 가져온다.
    public static School getInstance() { //싱글톤 패턴(최초 한번만 new 연산자를 통하여 메모리에 할당한다.)

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
