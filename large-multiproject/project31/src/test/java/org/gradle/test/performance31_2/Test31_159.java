package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_159 {
    private final Production31_159 production = new Production31_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}