package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringProblemsTest{
    @Test
    void testEndsly1(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = true;
        boolean studentOutput= o.endsLy("oddly");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testEndsly2(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = false;
        boolean studentOutput= o.endsLy("y");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testEndsly3(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = false;
        boolean studentOutput= o.endsLy("oddy");
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testConcat1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "abcat";
        String studentOutput= o.conCat("abc","cat");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testConcat2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "dogcat";
        String studentOutput= o.conCat("dog","cat");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testConcat3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "abc";
        String studentOutput= o.conCat("abc","");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "llo";
        String studentOutput= o.deFront("Hello");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "va";
        String studentOutput= o.deFront("java");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "aay";
        String studentOutput= o.deFront("away");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront4(){
        StringProblems o = new StringProblems();
        String expectedOutput = "apple";
        String studentOutput= o.deFront("aapple");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront5(){
        StringProblems o = new StringProblems();
        String expectedOutput = "abee";
        String studentOutput= o.deFront("abee");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testDefront6(){
        StringProblems o = new StringProblems();
        String expectedOutput = "bring";
        String studentOutput= o.deFront("xbring");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDefront7(){
        StringProblems o = new StringProblems();
        String expectedOutput = "";
        String studentOutput= o.deFront("ba");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testWithoutX1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Hi";
        String studentOutput= o.withoutX("xHix");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testWithoutX2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Hi";
        String studentOutput= o.withoutX("xHi");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testWithoutX3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Hxi";
        String studentOutput= o.withoutX("Hxix");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Fizz";
        String studentOutput= o.fizzString("fig");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Buzz";
        String studentOutput= o.fizzString("dib");
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "FizzBuzz";
        String studentOutput= o.fizzString("fib");
        assertEquals(expectedOutput,studentOutput);
    }






    @Test
    void testfizzString2A(){
        StringProblems o = new StringProblems();
        String expectedOutput = "1!";
        String studentOutput= o.fizzString2(1);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2B(){
        StringProblems o = new StringProblems();
        String expectedOutput = "2!";
        String studentOutput= o.fizzString2(2);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2C(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Fizz!";
        String studentOutput= o.fizzString2(3);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2D(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Buzz!";
        String studentOutput= o.fizzString2(10);
        assertEquals(expectedOutput,studentOutput);
    }


   
    @Test
    void testfizzString2E(){
        StringProblems o = new StringProblems();
        String expectedOutput = "FizzBuzz!";
        String studentOutput= o.fizzString2(15);
        assertEquals(expectedOutput,studentOutput);
    }


}