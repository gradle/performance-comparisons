package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_405 {
    private final Production55_405 production = new Production55_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}