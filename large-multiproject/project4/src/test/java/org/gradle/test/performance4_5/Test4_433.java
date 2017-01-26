package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_433 {
    private final Production4_433 production = new Production4_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}