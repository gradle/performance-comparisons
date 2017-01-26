package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_433 {
    private final Production89_433 production = new Production89_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}