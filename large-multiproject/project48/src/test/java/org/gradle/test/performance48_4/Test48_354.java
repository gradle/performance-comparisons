package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_354 {
    private final Production48_354 production = new Production48_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}