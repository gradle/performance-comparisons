package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_411 {
    private final Production31_411 production = new Production31_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}