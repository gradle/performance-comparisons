package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_311 {
    private final Production80_311 production = new Production80_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}