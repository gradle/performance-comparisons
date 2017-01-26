package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_159 {
    private final Production13_159 production = new Production13_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}