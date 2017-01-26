package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_343 {
    private final Production55_343 production = new Production55_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}