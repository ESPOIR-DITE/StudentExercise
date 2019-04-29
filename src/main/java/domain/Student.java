package domain;

public class Student implements IStudent
{
    private String name;
    private  String studentNumber;


    private Student ()
    {

    }//default constructor of the entire class

    public Student(Builder builder)
    {
        this.name = builder.name;
        this.studentNumber = builder.studentNumber;
    }//builder constructor

    public String getName()
    {
        return name;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }// getters method to return variable

    public static class Builder
    {
        private String name;
        private  String studentNumber;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder studentNumber(String studentNumber)
        {
            this.studentNumber = studentNumber;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "name" + name + '\'' + ", studentNumber='" + studentNumber + '\'' + '}';

    }
}
