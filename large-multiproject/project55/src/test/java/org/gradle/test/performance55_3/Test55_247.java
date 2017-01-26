package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_247 {
    private final Production55_247 production = new Production55_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}