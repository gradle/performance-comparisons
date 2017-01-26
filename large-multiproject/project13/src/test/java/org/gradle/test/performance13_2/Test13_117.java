package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_117 {
    private final Production13_117 production = new Production13_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}