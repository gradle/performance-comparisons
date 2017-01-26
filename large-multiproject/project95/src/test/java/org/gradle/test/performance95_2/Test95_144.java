package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_144 {
    private final Production95_144 production = new Production95_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}