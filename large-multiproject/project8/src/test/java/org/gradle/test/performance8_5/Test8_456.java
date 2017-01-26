package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_456 {
    private final Production8_456 production = new Production8_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}