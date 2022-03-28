package com.example.whitebox;

import org.junit.Test;

// 100% Branch Coverage
public class WhiteboxTestingBC3 {

    @Test
    public void Test1() { WhiteBoxClass.test03(true, false, 3); }

    @Test
    public void Test2() { WhiteBoxClass.test03(false, true, 5); }

    @Test
    public void Test3() { WhiteBoxClass.test03(false, false, 5); }
}
