package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_292 {
    private final Production13_292 production = new Production13_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}