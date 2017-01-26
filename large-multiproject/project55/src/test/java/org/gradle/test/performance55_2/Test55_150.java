package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_150 {
    private final Production55_150 production = new Production55_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}