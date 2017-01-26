package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_143 {
    private final Production55_143 production = new Production55_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}