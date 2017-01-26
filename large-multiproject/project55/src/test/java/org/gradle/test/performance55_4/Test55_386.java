package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_386 {
    private final Production55_386 production = new Production55_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}