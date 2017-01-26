package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_192 {
    private final Production55_192 production = new Production55_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}