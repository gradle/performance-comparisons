package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_361 {
    private final Production55_361 production = new Production55_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}