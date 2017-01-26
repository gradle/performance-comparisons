package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_430 {
    private final Production3_430 production = new Production3_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}