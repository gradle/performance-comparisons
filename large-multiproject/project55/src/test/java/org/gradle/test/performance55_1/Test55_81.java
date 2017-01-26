package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_81 {
    private final Production55_81 production = new Production55_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}