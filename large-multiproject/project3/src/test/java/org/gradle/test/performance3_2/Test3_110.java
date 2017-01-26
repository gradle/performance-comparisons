package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_110 {
    private final Production3_110 production = new Production3_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}