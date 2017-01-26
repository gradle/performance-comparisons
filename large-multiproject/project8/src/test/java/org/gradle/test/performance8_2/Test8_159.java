package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_159 {
    private final Production8_159 production = new Production8_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}