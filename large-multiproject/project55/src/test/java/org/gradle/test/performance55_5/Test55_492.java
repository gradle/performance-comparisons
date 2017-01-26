package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_492 {
    private final Production55_492 production = new Production55_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}