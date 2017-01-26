package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_216 {
    private final Production55_216 production = new Production55_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}