package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_376 {
    private final Production3_376 production = new Production3_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}