package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_317 {
    private final Production55_317 production = new Production55_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}