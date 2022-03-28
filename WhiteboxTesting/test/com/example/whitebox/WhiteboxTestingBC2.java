package com.example.whitebox;

import org.junit.Test;

// 100% Branch Coverage
public class WhiteboxTestingBC2 {

    @Test
    public void Test1() { WhiteBoxClass.test02(true, false, 3); }

    @Test
    public void Test2() { WhiteBoxClass.test02(false, true, 3); }

    @Test
    public void Test3() { WhiteBoxClass.test02(false, false, 5); }
}
