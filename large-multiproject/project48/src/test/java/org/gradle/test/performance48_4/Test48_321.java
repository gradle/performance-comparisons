package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_321 {
    private final Production48_321 production = new Production48_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}