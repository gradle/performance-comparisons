package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_307 {
    private final Production55_307 production = new Production55_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}