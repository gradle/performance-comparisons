package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_132 {
    private final Production13_132 production = new Production13_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}