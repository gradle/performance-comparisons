package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_6 {
    private final Production55_6 production = new Production55_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}