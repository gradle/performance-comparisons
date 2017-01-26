package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_277 {
    private final Production55_277 production = new Production55_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}