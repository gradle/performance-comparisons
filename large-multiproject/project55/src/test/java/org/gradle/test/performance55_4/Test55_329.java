package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_329 {
    private final Production55_329 production = new Production55_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}