package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_159 {
    private final Production83_159 production = new Production83_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}