package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_87 {
    private final Production55_87 production = new Production55_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}