package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_433 {
    private final Production83_433 production = new Production83_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}