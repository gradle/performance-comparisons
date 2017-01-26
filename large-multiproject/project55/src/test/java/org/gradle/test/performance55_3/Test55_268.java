package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_268 {
    private final Production55_268 production = new Production55_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}