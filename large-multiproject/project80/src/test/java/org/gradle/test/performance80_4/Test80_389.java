package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_389 {
    private final Production80_389 production = new Production80_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}