package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_381 {
    private final Production48_381 production = new Production48_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}