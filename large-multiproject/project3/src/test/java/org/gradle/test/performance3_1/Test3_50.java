package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_50 {
    private final Production3_50 production = new Production3_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}