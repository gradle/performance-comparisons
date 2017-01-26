package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_308 {
    private final Production55_308 production = new Production55_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}