package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_159 {
    private final Production80_159 production = new Production80_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}