package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_48 {
    private final Production55_48 production = new Production55_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}