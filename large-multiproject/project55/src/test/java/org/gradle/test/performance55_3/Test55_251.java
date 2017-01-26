package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_251 {
    private final Production55_251 production = new Production55_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}