package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_456 {
    private final Production31_456 production = new Production31_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}