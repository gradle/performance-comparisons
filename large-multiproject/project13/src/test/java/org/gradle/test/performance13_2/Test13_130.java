package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_130 {
    private final Production13_130 production = new Production13_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}