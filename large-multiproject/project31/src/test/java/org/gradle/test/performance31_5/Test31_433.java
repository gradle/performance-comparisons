package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_433 {
    private final Production31_433 production = new Production31_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}