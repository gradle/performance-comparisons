package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_63 {
    private final Production55_63 production = new Production55_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}