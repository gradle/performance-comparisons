package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_395 {
    private final Production55_395 production = new Production55_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}