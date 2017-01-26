package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_159 {
    private final Production4_159 production = new Production4_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}