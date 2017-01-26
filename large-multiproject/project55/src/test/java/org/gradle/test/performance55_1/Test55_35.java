package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_35 {
    private final Production55_35 production = new Production55_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}