package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_16 {
    private final Production55_16 production = new Production55_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}