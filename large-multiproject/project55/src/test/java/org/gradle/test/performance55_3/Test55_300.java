package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_300 {
    private final Production55_300 production = new Production55_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}