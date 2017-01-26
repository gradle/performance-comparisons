package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_359 {
    private final Production80_359 production = new Production80_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}