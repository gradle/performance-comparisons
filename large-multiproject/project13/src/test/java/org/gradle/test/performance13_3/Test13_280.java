package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_280 {
    private final Production13_280 production = new Production13_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}