package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_397 {
    private final Production8_397 production = new Production8_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}