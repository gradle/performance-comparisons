package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_148 {
    private final Production55_148 production = new Production55_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}