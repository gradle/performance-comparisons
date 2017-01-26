package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_396 {
    private final Production48_396 production = new Production48_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}