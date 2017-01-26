package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_7 {
    private final Production55_7 production = new Production55_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}