package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_348 {
    private final Production80_348 production = new Production80_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}