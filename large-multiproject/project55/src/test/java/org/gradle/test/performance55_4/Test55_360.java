package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_360 {
    private final Production55_360 production = new Production55_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}