package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_137 {
    private final Production55_137 production = new Production55_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}