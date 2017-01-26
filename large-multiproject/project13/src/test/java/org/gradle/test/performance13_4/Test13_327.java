package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_327 {
    private final Production13_327 production = new Production13_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}