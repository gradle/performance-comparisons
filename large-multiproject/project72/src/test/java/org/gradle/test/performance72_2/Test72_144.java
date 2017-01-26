package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_144 {
    private final Production72_144 production = new Production72_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}