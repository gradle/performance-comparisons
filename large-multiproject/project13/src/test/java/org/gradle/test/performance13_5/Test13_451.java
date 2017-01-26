package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_451 {
    private final Production13_451 production = new Production13_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}