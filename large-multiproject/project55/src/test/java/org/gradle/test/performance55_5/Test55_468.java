package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_468 {
    private final Production55_468 production = new Production55_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}