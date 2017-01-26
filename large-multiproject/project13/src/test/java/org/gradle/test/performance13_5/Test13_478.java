package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_478 {
    private final Production13_478 production = new Production13_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}