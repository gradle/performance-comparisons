package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_159 {
    private final Production16_159 production = new Production16_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}