package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_411 {
    private final Production4_411 production = new Production4_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}