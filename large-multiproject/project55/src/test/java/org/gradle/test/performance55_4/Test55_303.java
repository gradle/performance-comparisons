package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_303 {
    private final Production55_303 production = new Production55_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}