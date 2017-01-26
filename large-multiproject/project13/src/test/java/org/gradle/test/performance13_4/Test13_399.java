package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_399 {
    private final Production13_399 production = new Production13_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}