package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_309 {
    private final Production48_309 production = new Production48_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}