package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_83 {
    private final Production55_83 production = new Production55_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}