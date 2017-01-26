package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_433 {
    private final Production24_433 production = new Production24_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}