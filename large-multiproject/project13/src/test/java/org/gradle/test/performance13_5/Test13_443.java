package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_443 {
    private final Production13_443 production = new Production13_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}