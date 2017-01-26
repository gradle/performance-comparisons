package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_440 {
    private final Production55_440 production = new Production55_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}