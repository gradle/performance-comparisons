package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_215 {
    private final Production55_215 production = new Production55_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}