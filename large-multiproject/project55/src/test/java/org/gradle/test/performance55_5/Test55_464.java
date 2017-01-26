package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_464 {
    private final Production55_464 production = new Production55_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}