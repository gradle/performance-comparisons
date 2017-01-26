package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_413 {
    private final Production13_413 production = new Production13_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}