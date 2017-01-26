package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_430 {
    private final Production86_430 production = new Production86_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}