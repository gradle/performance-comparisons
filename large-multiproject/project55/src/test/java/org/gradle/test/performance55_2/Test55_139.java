package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_139 {
    private final Production55_139 production = new Production55_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}