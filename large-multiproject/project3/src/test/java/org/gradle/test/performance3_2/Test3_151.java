package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_151 {
    private final Production3_151 production = new Production3_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}