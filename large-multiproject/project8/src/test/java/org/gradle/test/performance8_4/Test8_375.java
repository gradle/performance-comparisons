package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_375 {
    private final Production8_375 production = new Production8_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}