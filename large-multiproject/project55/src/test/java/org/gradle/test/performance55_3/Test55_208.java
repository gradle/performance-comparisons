package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_208 {
    private final Production55_208 production = new Production55_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}