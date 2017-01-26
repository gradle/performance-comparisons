package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_316 {
    private final Production80_316 production = new Production80_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}