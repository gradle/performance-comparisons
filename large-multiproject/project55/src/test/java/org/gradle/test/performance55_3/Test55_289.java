package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_289 {
    private final Production55_289 production = new Production55_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}