package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_210 {
    private final Production55_210 production = new Production55_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}