package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_183 {
    private final Production55_183 production = new Production55_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}