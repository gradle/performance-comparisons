package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_159 {
    private final Production20_159 production = new Production20_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}