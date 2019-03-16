package Assignment4.DIPPrinciple;

public interface Student
{
    // DIP compliant
    interface StudentI
    {
        public void study();
    }

    class Student3 implements Student
    {

        public void study() {

        }
    }

    class SuperStudent  implements Student{
        public void study() {

        }
    }

    class Lecturer {
        Student student;

        public void setStudent(Student s) {
            student = s;
        }

        public void lecture() {

        }
    }

}
//DIP violation
class Student2 {

    public Student2() {


    }


}
class Lecturer {

    Student2 student;



    public void setStudent(Student2 s) {
        student = s;
    }

    public void lecture() {

    }
}

class SupeStudentr {
    public void study() {

    }
}




