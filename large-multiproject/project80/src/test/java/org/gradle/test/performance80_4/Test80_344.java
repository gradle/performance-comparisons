package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_344 {
    private final Production80_344 production = new Production80_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}