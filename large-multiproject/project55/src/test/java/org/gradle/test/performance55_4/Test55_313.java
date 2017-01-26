package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_313 {
    private final Production55_313 production = new Production55_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}