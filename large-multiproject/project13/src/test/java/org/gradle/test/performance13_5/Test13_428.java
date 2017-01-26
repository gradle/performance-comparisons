package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_428 {
    private final Production13_428 production = new Production13_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}