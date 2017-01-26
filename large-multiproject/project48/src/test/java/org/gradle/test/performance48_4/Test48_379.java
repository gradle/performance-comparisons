package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_379 {
    private final Production48_379 production = new Production48_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}