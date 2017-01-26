package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_443 {
    private final Production8_443 production = new Production8_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}