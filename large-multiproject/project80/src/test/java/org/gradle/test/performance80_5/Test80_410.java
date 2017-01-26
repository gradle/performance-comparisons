package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_410 {
    private final Production80_410 production = new Production80_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}