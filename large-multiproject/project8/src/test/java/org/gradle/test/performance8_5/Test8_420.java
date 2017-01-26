package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_420 {
    private final Production8_420 production = new Production8_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}