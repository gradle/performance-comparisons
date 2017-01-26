package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_173 {
    private final Production55_173 production = new Production55_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}