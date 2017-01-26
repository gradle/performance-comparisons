package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_463 {
    private final Production8_463 production = new Production8_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}