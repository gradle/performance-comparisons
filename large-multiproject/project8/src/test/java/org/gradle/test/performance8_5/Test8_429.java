package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_429 {
    private final Production8_429 production = new Production8_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}