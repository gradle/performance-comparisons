package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_419 {
    private final Production55_419 production = new Production55_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}