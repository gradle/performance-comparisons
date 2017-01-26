package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_152 {
    private final Production55_152 production = new Production55_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}