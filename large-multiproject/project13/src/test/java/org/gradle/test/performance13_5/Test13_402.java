package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_402 {
    private final Production13_402 production = new Production13_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}