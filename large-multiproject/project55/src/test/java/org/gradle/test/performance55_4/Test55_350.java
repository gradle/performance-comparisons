package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_350 {
    private final Production55_350 production = new Production55_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}