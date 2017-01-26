package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_140 {
    private final Production55_140 production = new Production55_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}