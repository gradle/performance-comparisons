package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_327 {
    private final Production8_327 production = new Production8_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}