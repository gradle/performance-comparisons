package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_202 {
    private final Production55_202 production = new Production55_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}