package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_194 {
    private final Production13_194 production = new Production13_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}