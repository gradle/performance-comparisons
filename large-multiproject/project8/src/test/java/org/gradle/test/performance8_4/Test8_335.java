package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_335 {
    private final Production8_335 production = new Production8_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}