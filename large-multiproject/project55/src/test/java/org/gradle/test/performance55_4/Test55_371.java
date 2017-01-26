package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_371 {
    private final Production55_371 production = new Production55_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}