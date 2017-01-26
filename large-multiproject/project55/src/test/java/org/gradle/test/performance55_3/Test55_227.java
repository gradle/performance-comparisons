package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_227 {
    private final Production55_227 production = new Production55_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}