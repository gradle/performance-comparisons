package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_37 {
    private final Production55_37 production = new Production55_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}