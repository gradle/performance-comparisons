package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_237 {
    private final Production48_237 production = new Production48_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}