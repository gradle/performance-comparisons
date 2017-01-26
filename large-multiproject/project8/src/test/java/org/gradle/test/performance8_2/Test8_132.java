package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_132 {
    private final Production8_132 production = new Production8_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}