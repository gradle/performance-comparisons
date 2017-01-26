package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_299 {
    private final Production13_299 production = new Production13_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}