package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest
{
    Student std;

    @Before
    public void setUp() throws Exception
    {
        std = new Student.Builder()
                         .name("Taylor")
                         .studentNumber("214291324")
                         .build();
    }

    @Test
    public void getName()
    {
        Assert.assertEquals("Taylor",std.getName());
        System.out.println(std.toString());
    }

    @Test
    public void getStudentNumber() {
    }

}