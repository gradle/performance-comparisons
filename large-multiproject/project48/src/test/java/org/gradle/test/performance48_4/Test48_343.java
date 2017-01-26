package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_343 {
    private final Production48_343 production = new Production48_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}