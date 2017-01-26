package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_190 {
    private final Production55_190 production = new Production55_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}