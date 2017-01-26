package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_206 {
    private final Production48_206 production = new Production48_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}