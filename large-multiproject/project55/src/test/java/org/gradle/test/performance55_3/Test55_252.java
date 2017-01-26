package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_252 {
    private final Production55_252 production = new Production55_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}