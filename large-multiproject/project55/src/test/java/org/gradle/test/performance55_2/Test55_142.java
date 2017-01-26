package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_142 {
    private final Production55_142 production = new Production55_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}