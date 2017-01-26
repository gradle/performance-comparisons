package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_489 {
    private final Production55_489 production = new Production55_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}