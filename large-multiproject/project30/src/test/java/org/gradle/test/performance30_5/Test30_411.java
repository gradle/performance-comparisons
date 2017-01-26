package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_411 {
    private final Production30_411 production = new Production30_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}