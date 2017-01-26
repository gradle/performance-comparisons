package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_8 {
    private final Production55_8 production = new Production55_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}