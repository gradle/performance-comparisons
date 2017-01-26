package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_387 {
    private final Production55_387 production = new Production55_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}