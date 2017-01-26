package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_411 {
    private final Production25_411 production = new Production25_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}