package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_224 {
    private final Production55_224 production = new Production55_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}