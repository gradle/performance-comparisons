package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_456 {
    private final Production75_456 production = new Production75_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}