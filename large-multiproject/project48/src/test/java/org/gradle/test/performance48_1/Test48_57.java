package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_57 {
    private final Production48_57 production = new Production48_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}