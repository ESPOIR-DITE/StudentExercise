package Factory;

import domain.Student;

public class StudentFactory
{
    private static Student getStudent(String name,String studentNumber)
    {
        return new Student.Builder()
                          .name(name)
                          .studentNumber(studentNumber)
                          .build();
    }
}
