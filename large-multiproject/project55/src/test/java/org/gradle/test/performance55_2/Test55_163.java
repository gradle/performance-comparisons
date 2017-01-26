package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_163 {
    private final Production55_163 production = new Production55_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}