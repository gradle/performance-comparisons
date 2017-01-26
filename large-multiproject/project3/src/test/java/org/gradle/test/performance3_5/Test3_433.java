package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_433 {
    private final Production3_433 production = new Production3_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}