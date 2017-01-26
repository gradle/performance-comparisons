package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_224 {
    private final Production48_224 production = new Production48_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}