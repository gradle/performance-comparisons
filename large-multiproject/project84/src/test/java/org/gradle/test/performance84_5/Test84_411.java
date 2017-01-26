package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_411 {
    private final Production84_411 production = new Production84_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}