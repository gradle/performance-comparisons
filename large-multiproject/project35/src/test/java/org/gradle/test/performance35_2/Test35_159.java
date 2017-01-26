package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_159 {
    private final Production35_159 production = new Production35_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}