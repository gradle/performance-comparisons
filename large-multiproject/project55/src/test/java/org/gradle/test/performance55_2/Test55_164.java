package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_164 {
    private final Production55_164 production = new Production55_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}