package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_433 {
    private final Production47_433 production = new Production47_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}