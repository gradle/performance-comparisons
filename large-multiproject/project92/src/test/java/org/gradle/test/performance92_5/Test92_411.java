package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_411 {
    private final Production92_411 production = new Production92_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}