package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_50 {
    private final Production8_50 production = new Production8_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}