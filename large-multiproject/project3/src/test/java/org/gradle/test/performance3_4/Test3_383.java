package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_383 {
    private final Production3_383 production = new Production3_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}