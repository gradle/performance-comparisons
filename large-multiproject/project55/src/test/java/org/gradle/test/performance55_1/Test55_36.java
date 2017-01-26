package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_36 {
    private final Production55_36 production = new Production55_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}