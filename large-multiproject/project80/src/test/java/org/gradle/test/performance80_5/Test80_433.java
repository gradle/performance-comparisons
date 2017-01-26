package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_433 {
    private final Production80_433 production = new Production80_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}