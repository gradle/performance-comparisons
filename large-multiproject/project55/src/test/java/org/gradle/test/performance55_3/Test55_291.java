package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_291 {
    private final Production55_291 production = new Production55_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}