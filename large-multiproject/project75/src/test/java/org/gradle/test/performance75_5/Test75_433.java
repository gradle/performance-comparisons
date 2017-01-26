package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_433 {
    private final Production75_433 production = new Production75_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}