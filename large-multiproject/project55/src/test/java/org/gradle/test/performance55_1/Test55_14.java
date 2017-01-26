package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_14 {
    private final Production55_14 production = new Production55_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}