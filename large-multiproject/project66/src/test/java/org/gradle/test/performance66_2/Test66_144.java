package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_144 {
    private final Production66_144 production = new Production66_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}