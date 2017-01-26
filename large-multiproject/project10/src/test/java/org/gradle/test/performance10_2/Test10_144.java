package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_144 {
    private final Production10_144 production = new Production10_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}