package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_467 {
    private final Production55_467 production = new Production55_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}