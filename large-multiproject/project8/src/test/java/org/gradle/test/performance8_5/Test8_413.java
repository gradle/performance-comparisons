package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_413 {
    private final Production8_413 production = new Production8_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}