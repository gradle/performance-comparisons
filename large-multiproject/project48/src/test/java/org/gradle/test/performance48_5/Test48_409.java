package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_409 {
    private final Production48_409 production = new Production48_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}