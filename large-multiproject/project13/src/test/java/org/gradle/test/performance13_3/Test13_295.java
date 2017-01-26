package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_295 {
    private final Production13_295 production = new Production13_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}