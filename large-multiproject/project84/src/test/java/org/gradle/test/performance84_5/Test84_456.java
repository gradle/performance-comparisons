package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_456 {
    private final Production84_456 production = new Production84_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}