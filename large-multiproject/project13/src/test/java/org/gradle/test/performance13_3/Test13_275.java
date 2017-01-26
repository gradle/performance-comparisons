package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_275 {
    private final Production13_275 production = new Production13_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}