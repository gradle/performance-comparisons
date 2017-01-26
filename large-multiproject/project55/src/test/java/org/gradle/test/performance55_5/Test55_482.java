package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_482 {
    private final Production55_482 production = new Production55_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}