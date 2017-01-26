package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_476 {
    private final Production55_476 production = new Production55_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}