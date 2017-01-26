package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_144 {
    private final Production65_144 production = new Production65_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}