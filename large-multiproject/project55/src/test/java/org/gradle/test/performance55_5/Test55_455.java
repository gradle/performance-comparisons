package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_455 {
    private final Production55_455 production = new Production55_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}