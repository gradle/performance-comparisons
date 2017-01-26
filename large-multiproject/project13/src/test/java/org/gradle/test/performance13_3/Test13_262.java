package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_262 {
    private final Production13_262 production = new Production13_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}