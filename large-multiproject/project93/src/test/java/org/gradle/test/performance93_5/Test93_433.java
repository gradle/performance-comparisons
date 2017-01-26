package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_433 {
    private final Production93_433 production = new Production93_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}