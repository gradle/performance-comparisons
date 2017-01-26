package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_342 {
    private final Production55_342 production = new Production55_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}