package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_123 {
    private final Production3_123 production = new Production3_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}