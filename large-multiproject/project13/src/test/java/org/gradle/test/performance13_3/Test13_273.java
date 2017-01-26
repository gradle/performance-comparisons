package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_273 {
    private final Production13_273 production = new Production13_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}