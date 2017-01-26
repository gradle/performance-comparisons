package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_144 {
    private final Production79_144 production = new Production79_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}