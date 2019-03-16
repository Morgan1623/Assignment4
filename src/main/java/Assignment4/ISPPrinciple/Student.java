package Assignment4.ISPPrinciple;

public interface Student
{
    interface Studenti extends Sleep, Student1 {
    }

    interface Student1 {
        public void study();
    }

    interface Sleep{
        public void sleep();
    }

    class Student3 implements Student1, Sleep{
        public void study() {

        }

        public void sleep() {

        }
    }

    class AI implements Student1{
        public void study() {

        }




        public void eat() {
            //.... eating in launch break
        }
    }

}
