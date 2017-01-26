package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_309 {
    private final Production55_309 production = new Production55_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}