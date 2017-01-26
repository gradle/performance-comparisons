package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_424 {
    private final Production55_424 production = new Production55_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}