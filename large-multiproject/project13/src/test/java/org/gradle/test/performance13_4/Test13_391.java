package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_391 {
    private final Production13_391 production = new Production13_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}