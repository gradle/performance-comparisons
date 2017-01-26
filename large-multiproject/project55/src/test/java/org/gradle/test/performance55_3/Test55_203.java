package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_203 {
    private final Production55_203 production = new Production55_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}