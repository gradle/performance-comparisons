package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_159 {
    private final Production58_159 production = new Production58_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}