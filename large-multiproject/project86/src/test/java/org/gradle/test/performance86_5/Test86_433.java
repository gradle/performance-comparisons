package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_433 {
    private final Production86_433 production = new Production86_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}