package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_287 {
    private final Production55_287 production = new Production55_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}