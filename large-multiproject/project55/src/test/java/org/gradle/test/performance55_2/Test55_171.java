package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_171 {
    private final Production55_171 production = new Production55_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}