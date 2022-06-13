/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tymt.mathutil.test.core;

import com.tymt.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ThanhTy
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters
    public static Object[][] initData() {

        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };

    }

    @Parameterized.Parameter(value = 0) // value = 0 là map với mảng data
    public int n; //bien ,map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1) 
    public long expected; //kiểu long vì giá trị trả về của hàm getF()
    // là long

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactiorial(n)); //tui mún 1! = 1

    }

}
