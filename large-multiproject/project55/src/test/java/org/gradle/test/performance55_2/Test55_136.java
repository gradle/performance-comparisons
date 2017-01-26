package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_136 {
    private final Production55_136 production = new Production55_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}