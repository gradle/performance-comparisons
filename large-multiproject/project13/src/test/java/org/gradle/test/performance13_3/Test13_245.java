package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_245 {
    private final Production13_245 production = new Production13_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}