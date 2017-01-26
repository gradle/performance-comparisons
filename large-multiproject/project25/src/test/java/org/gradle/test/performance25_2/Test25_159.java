package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_159 {
    private final Production25_159 production = new Production25_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}