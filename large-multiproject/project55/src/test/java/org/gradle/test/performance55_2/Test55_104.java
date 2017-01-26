package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_104 {
    private final Production55_104 production = new Production55_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}