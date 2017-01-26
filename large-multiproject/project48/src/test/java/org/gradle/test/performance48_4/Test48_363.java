package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_363 {
    private final Production48_363 production = new Production48_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}