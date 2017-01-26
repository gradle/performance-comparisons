package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_379 {
    private final Production55_379 production = new Production55_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}