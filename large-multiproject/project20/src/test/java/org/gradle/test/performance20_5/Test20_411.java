package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_411 {
    private final Production20_411 production = new Production20_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}