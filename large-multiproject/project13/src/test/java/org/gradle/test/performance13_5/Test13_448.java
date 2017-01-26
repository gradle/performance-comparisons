package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_448 {
    private final Production13_448 production = new Production13_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}