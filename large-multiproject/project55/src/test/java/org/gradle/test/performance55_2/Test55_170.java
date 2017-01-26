package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_170 {
    private final Production55_170 production = new Production55_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}