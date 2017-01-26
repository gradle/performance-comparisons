package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_144 {
    private final Production71_144 production = new Production71_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}