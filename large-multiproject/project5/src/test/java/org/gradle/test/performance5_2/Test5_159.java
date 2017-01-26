package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_159 {
    private final Production5_159 production = new Production5_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}