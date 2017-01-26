package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_487 {
    private final Production13_487 production = new Production13_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}