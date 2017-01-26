package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_105 {
    private final Production55_105 production = new Production55_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}