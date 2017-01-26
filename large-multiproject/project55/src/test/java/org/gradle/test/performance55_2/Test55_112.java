package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_112 {
    private final Production55_112 production = new Production55_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}