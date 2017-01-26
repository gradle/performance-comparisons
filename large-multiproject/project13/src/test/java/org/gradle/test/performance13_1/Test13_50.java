package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_50 {
    private final Production13_50 production = new Production13_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}