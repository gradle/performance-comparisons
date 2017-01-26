package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_375 {
    private final Production13_375 production = new Production13_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}