package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_469 {
    private final Production55_469 production = new Production55_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}