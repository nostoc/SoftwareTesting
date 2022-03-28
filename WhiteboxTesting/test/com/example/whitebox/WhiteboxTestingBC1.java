package com.example.whitebox;

import org.junit.Test;

/**
 * Code Coverage:
 *  Control-flow coverage:
 *      Statement coverage
 *      Branch coverage
 *      Path coverage
 */

// 100% Branch Coverage
public class WhiteboxTestingBC1 {

    @Test
    public void Test1() { WhiteBoxClass.test01(7,1); }

    @Test
    public void Test2() { WhiteBoxClass.test01(12, -2); }
}
