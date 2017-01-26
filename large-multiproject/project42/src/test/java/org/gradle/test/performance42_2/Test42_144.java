package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_144 {
    private final Production42_144 production = new Production42_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}