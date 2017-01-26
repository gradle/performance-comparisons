package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_383 {
    private final Production8_383 production = new Production8_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}