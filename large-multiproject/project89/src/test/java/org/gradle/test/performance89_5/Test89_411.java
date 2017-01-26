package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_411 {
    private final Production89_411 production = new Production89_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}