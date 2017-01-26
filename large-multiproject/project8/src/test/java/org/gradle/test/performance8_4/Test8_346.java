package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_346 {
    private final Production8_346 production = new Production8_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}