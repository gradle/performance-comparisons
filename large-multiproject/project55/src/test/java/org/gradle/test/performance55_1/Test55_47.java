package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_47 {
    private final Production55_47 production = new Production55_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}