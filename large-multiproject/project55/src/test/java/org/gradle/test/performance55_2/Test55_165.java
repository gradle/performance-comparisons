package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_165 {
    private final Production55_165 production = new Production55_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}