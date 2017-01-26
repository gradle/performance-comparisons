package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_144 {
    private final Production60_144 production = new Production60_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}