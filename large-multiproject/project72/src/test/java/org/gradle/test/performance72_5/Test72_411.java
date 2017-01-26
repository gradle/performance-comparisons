package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_411 {
    private final Production72_411 production = new Production72_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}