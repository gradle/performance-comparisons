package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_402 {
    private final Production8_402 production = new Production8_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}