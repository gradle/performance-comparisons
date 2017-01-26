package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_5 {
    private final Production55_5 production = new Production55_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}