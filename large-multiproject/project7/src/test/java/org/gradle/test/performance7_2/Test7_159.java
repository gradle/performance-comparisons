package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_159 {
    private final Production7_159 production = new Production7_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}