package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_411 {
    private final Production16_411 production = new Production16_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}