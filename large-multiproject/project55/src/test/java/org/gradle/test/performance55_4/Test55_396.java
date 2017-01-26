package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_396 {
    private final Production55_396 production = new Production55_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}