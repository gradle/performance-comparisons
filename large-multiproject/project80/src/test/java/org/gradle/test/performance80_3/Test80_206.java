package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_206 {
    private final Production80_206 production = new Production80_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}