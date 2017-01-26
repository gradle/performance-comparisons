package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_433 {
    private final Production74_433 production = new Production74_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}