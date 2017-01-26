package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_297 {
    private final Production55_297 production = new Production55_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}