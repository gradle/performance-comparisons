package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_156 {
    private final Production55_156 production = new Production55_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}