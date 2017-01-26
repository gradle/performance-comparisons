package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_374 {
    private final Production75_374 production = new Production75_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}