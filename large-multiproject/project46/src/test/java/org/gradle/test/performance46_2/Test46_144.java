package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_144 {
    private final Production46_144 production = new Production46_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}