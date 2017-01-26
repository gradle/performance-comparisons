package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_318 {
    private final Production55_318 production = new Production55_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}