package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_120 {
    private final Production55_120 production = new Production55_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}