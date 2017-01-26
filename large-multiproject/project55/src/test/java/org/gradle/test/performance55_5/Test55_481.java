package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_481 {
    private final Production55_481 production = new Production55_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}