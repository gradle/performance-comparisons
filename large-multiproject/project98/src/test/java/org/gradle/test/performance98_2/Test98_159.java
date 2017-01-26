package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_159 {
    private final Production98_159 production = new Production98_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}