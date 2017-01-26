package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_384 {
    private final Production48_384 production = new Production48_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}