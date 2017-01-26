package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_487 {
    private final Production8_487 production = new Production8_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}