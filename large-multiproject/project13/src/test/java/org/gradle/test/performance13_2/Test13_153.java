package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_153 {
    private final Production13_153 production = new Production13_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}