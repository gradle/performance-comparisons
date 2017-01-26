package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_422 {
    private final Production55_422 production = new Production55_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}