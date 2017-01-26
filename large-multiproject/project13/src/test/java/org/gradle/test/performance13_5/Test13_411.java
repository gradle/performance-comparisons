package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_411 {
    private final Production13_411 production = new Production13_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}