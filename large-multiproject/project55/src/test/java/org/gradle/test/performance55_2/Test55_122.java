package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_122 {
    private final Production55_122 production = new Production55_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}