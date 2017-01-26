package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_184 {
    private final Production13_184 production = new Production13_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}