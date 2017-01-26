package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_129 {
    private final Production55_129 production = new Production55_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}