package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_193 {
    private final Production55_193 production = new Production55_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}