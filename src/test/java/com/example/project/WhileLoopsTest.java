package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhileLoopsTest {

    @Test
    void testCountEvensUpTo_basic() {
        assertEquals(0, WhileLoops.countEvensUpTo(1));
        assertEquals(1, WhileLoops.countEvensUpTo(2));   // {2}
        assertEquals(3, WhileLoops.countEvensUpTo(6));   // {2,4,6}
        assertEquals(5, WhileLoops.countEvensUpTo(10));  // {2,4,6,8,10}
    }

    @Test
    void testCountEvensUpTo_edgeCases() {
        assertEquals(0, WhileLoops.countEvensUpTo(0));
        assertEquals(0, WhileLoops.countEvensUpTo(-5));
        assertEquals(7, WhileLoops.countEvensUpTo(15));  // 2..14 (7 evens)
    }


    @Test
    void testDigitSum_basic() {
        assertEquals(0, WhileLoops.digitSum(0));
        assertEquals(7, WhileLoops.digitSum(7));
        assertEquals(6, WhileLoops.digitSum(123));
        assertEquals(21, WhileLoops.digitSum(4098));
    }

    @Test
    void testDigitSum_more() {
        assertEquals(19, WhileLoops.digitSum(199));   
        assertEquals(1, WhileLoops.digitSum(1000));  
        assertEquals(45, WhileLoops.digitSum(99999)); 
    }

    @Test
    void testCountDownBy_basic() {
        assertEquals(2, WhileLoops.countDownBy(20, 3));  
        assertEquals(2, WhileLoops.countDownBy(10, 4));  
        assertEquals(0, WhileLoops.countDownBy(5, 5));  
        assertEquals(4, WhileLoops.countDownBy(4, 6));   // can't subtract once
    }

    @Test
    void testCountDownBy_edgeCases() {
        assertEquals(7, WhileLoops.countDownBy(7, 10));  // no subtraction
        assertEquals(0, WhileLoops.countDownBy(0, 5));   

        // Define behavior when step <= 0: just return start
        assertEquals(7, WhileLoops.countDownBy(7, 0));
        assertEquals(7, WhileLoops.countDownBy(7, -3));
    }

    @Test
    void testWeeksToReachGoal_basic() {
        assertEquals(4, WhileLoops.weeksToReachGoal(0, 50, 200));
        assertEquals(1, WhileLoops.weeksToReachGoal(100, 20, 110));
        assertEquals(0, WhileLoops.weeksToReachGoal(500, 100, 400)); // already enough
        assertEquals(3, WhileLoops.weeksToReachGoal(10, 10, 40));   
    }

    @Test
    void testWeeksToReachGoal_edgeCases() {
        assertEquals(0, WhileLoops.weeksToReachGoal(0, 10, 0));   // goal already met
        assertEquals(0, WhileLoops.weeksToReachGoal(10, 10, 10)); // already at goal
    }

    @Test
    void testMinutesUntilDead_basic() {
        assertEquals(10, WhileLoops.minutesUntilDead(100, 10)); 
        assertEquals(2, WhileLoops.minutesUntilDead(15, 10));   
        assertEquals(1, WhileLoops.minutesUntilDead(5, 10));   
    }

    @Test
    void testMinutesUntilDead_edgeCases() {
        assertEquals(0, WhileLoops.minutesUntilDead(0, 10));   // already dead
        assertEquals(0, WhileLoops.minutesUntilDead(-5, 10));  // invalid start
        assertEquals(0, WhileLoops.minutesUntilDead(50, 0));   // invalid usage rate
        assertEquals(0, WhileLoops.minutesUntilDead(50, -5));  // invalid usage rate

        assertEquals(4, WhileLoops.minutesUntilDead(100, 33));
        // 100 -> 67 (1) -> 34 (2) -> 1 (3) -> -32 (4)
    }
}
