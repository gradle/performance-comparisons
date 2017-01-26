package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_433 {
    private final Production43_433 production = new Production43_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}