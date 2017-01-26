package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_337 {
    private final Production48_337 production = new Production48_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}