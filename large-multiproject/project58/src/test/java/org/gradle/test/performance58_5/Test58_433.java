package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_433 {
    private final Production58_433 production = new Production58_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}