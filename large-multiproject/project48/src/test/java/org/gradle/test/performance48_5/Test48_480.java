package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_480 {
    private final Production48_480 production = new Production48_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}