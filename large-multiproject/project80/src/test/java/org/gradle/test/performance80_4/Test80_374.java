package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_374 {
    private final Production80_374 production = new Production80_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}