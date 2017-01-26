package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_233 {
    private final Production80_233 production = new Production80_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}