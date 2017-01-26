package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_488 {
    private final Production55_488 production = new Production55_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}