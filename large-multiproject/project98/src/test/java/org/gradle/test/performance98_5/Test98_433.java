package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_433 {
    private final Production98_433 production = new Production98_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}