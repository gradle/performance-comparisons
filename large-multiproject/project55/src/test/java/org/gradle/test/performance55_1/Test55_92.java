package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_92 {
    private final Production55_92 production = new Production55_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}