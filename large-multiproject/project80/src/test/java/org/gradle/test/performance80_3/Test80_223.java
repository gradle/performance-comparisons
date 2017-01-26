package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_223 {
    private final Production80_223 production = new Production80_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}