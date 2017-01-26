package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_484 {
    private final Production55_484 production = new Production55_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}