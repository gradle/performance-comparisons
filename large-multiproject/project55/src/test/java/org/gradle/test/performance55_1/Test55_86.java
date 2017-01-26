package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_86 {
    private final Production55_86 production = new Production55_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}