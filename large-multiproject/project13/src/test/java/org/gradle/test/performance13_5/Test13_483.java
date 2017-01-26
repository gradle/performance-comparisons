package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_483 {
    private final Production13_483 production = new Production13_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}