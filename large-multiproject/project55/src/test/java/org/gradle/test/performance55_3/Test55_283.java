package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_283 {
    private final Production55_283 production = new Production55_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}