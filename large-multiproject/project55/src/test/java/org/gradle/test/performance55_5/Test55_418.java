package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_418 {
    private final Production55_418 production = new Production55_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}