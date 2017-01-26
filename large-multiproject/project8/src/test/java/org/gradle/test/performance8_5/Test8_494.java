package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_494 {
    private final Production8_494 production = new Production8_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}