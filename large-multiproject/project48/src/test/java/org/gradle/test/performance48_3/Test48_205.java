package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_205 {
    private final Production48_205 production = new Production48_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}