package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_411 {
    private final Production5_411 production = new Production5_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}