package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_232 {
    private final Production55_232 production = new Production55_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}