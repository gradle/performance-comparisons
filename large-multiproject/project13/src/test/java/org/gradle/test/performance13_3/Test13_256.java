package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_256 {
    private final Production13_256 production = new Production13_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}