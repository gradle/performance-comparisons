package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_398 {
    private final Production55_398 production = new Production55_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}