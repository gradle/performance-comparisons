package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_490 {
    private final Production13_490 production = new Production13_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}