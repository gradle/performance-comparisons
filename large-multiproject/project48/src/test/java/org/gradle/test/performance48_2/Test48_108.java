package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_108 {
    private final Production48_108 production = new Production48_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}