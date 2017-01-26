package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_54 {
    private final Production55_54 production = new Production55_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}