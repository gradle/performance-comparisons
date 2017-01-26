package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_411 {
    private final Production48_411 production = new Production48_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}