package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_298 {
    private final Production80_298 production = new Production80_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}