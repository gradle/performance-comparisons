package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_151 {
    private final Production55_151 production = new Production55_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}