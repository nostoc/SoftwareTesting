package com.example.whitebox;

import org.junit.Test;

/**
 * Code Coverage:
 *  Control-flow coverage:
 *      Statement coverage
 *      Branch coverage
 *      Path coverage
 */

// Path Coverage
public class WhiteboxTestingPC3 {

    @Test
    public void Test1() { WhiteBoxClass.test03(true, false, 3); }

    @Test
    public void Test2() { WhiteBoxClass.test03(false, true, 3); }

    @Test
    public void Test3() { WhiteBoxClass.test03(false, false, 3); }

    @Test
    public void Test4() { WhiteBoxClass.test03(true, true, 3); }

}
