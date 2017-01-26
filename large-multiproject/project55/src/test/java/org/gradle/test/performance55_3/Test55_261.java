package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_261 {
    private final Production55_261 production = new Production55_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}