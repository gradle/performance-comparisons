package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_431 {
    private final Production55_431 production = new Production55_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}