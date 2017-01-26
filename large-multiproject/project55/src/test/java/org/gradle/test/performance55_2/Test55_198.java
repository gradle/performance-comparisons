package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_198 {
    private final Production55_198 production = new Production55_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}