package com.kenny;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private int[] input;
    private int[] output;

    public SolutionTest(int[] input, int[] output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {new int[]{5, 3, 2, 8, 1, 4}, new int[]{1, 3, 2, 8, 5, 4}},
                {new int[]{5, 3, 2, 8, 1, 4, 9, 12, 15, 13, 10, 11, 14}, new int[]{1, 3, 2, 8, 5, 4, 9, 12,11, 13, 10, 15, 14}}}
        );
    }

    @org.junit.Test
    public void sortArray(){
        Assert.assertArrayEquals(output, Solution.sortArray(input));
    }
}
