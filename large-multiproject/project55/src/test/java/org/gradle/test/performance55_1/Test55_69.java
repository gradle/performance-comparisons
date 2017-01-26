package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_69 {
    private final Production55_69 production = new Production55_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}