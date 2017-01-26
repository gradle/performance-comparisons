package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_411 {
    private final Production47_411 production = new Production47_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}