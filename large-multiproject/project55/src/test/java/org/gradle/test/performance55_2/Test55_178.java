package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_178 {
    private final Production55_178 production = new Production55_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}