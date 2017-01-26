package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_272 {
    private final Production55_272 production = new Production55_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}