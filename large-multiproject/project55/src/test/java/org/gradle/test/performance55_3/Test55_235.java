package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_235 {
    private final Production55_235 production = new Production55_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}