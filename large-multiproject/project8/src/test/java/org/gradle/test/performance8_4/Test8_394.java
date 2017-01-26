package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_394 {
    private final Production8_394 production = new Production8_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}