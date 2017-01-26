package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_322 {
    private final Production55_322 production = new Production55_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}