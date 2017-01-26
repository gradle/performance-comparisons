package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_159 {
    private final Production48_159 production = new Production48_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}