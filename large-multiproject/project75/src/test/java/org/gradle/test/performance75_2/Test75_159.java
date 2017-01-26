package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_159 {
    private final Production75_159 production = new Production75_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}