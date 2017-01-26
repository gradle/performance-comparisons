package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_31 {
    private final Production55_31 production = new Production55_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}