package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_346 {
    private final Production80_346 production = new Production80_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}