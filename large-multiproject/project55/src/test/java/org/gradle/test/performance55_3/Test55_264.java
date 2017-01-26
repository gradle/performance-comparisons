package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_264 {
    private final Production55_264 production = new Production55_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}