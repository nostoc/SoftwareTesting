package com.example.whitebox;

import org.junit.Test;

// These test cases will fail due to Arithmetic Exception by zero
public class WhiteboxTestingError {

    @Test
    public void Test1() { WhiteBoxClass.test01(7,0); }

    @Test
    public void Test2() { WhiteBoxClass.test02(false, true, 0); }

    @Test
    public void Test3() { WhiteBoxClass.test03(true, false, 0); }
}
