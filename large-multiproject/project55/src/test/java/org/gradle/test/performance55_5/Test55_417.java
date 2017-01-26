package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_417 {
    private final Production55_417 production = new Production55_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}