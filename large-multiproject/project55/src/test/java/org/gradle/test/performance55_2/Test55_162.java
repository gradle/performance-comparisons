package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_162 {
    private final Production55_162 production = new Production55_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}