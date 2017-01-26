package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_159 {
    private final Production41_159 production = new Production41_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}