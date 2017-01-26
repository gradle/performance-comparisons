package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_477 {
    private final Production55_477 production = new Production55_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}