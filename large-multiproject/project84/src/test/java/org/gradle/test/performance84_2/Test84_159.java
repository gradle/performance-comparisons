package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_159 {
    private final Production84_159 production = new Production84_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}