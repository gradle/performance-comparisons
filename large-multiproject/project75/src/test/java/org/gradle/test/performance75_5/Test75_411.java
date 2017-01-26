package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_411 {
    private final Production75_411 production = new Production75_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}