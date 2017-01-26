package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_283 {
    private final Production48_283 production = new Production48_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}