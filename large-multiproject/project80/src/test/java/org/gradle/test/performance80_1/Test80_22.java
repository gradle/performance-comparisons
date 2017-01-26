package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_22 {
    private final Production80_22 production = new Production80_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}