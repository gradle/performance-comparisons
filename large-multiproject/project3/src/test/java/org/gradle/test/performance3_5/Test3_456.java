package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_456 {
    private final Production3_456 production = new Production3_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}