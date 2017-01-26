package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_213 {
    private final Production55_213 production = new Production55_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}