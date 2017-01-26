package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_290 {
    private final Production55_290 production = new Production55_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}