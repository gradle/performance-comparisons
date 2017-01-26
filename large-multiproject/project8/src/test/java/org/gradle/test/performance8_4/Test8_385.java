package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_385 {
    private final Production8_385 production = new Production8_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}