package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_229 {
    private final Production55_229 production = new Production55_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}