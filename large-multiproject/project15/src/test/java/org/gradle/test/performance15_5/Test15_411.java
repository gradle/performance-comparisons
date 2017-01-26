package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_411 {
    private final Production15_411 production = new Production15_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}