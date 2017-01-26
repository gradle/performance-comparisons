package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_175 {
    private final Production55_175 production = new Production55_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}