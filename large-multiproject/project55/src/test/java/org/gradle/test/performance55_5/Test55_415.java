package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_415 {
    private final Production55_415 production = new Production55_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}