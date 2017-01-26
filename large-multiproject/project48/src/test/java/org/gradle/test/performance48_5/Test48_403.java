package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_403 {
    private final Production48_403 production = new Production48_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}