package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_33 {
    private final Production55_33 production = new Production55_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}