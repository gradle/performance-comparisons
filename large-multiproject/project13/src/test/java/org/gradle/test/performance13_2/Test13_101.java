package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_101 {
    private final Production13_101 production = new Production13_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}