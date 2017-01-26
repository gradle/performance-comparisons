package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_12 {
    private final Production55_12 production = new Production55_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}