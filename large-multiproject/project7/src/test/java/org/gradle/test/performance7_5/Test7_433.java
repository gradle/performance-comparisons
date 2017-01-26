package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_433 {
    private final Production7_433 production = new Production7_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}