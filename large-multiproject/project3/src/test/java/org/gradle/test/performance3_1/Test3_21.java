package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_21 {
    private final Production3_21 production = new Production3_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}