package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_476 {
    private final Production48_476 production = new Production48_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}