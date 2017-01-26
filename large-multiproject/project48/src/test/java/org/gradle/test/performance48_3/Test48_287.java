package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_287 {
    private final Production48_287 production = new Production48_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}