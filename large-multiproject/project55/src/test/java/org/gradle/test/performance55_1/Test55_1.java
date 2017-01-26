package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_1 {
    private final Production55_1 production = new Production55_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}