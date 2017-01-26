package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_456 {
    private final Production4_456 production = new Production4_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}