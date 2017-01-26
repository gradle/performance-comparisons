package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_370 {
    private final Production55_370 production = new Production55_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}