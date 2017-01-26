package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_424 {
    private final Production48_424 production = new Production48_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}