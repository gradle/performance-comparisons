package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_457 {
    private final Production55_457 production = new Production55_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}