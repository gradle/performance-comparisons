package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_60 {
    private final Production55_60 production = new Production55_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}