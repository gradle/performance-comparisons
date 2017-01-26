package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_131 {
    private final Production48_131 production = new Production48_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}