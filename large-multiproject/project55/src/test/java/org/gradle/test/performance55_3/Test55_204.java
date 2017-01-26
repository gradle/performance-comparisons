package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_204 {
    private final Production55_204 production = new Production55_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}