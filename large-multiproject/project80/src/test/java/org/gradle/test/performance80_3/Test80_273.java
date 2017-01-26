package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_273 {
    private final Production80_273 production = new Production80_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}