package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_263 {
    private final Production55_263 production = new Production55_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}