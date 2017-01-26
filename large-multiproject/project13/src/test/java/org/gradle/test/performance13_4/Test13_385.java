package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_385 {
    private final Production13_385 production = new Production13_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}