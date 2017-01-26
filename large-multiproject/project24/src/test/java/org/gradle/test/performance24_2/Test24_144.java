package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_144 {
    private final Production24_144 production = new Production24_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}