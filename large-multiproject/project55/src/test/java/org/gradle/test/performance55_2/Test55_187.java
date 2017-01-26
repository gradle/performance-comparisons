package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_187 {
    private final Production55_187 production = new Production55_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}