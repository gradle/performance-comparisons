package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_346 {
    private final Production13_346 production = new Production13_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}