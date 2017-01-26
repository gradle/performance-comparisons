package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_411 {
    private final Production93_411 production = new Production93_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}