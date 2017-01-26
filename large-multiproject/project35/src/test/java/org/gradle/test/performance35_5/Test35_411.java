package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_411 {
    private final Production35_411 production = new Production35_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}