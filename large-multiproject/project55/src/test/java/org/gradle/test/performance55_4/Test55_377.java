package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_377 {
    private final Production55_377 production = new Production55_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}