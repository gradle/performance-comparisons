package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_191 {
    private final Production55_191 production = new Production55_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}