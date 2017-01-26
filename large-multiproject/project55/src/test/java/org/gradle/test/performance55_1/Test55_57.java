package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_57 {
    private final Production55_57 production = new Production55_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}