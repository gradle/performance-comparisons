package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_319 {
    private final Production13_319 production = new Production13_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}