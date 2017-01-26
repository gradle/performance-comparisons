package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_217 {
    private final Production55_217 production = new Production55_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}