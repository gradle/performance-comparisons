package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_159 {
    private final Production37_159 production = new Production37_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}