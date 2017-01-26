package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_159 {
    private final Production14_159 production = new Production14_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}