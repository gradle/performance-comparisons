package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_258 {
    private final Production48_258 production = new Production48_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}