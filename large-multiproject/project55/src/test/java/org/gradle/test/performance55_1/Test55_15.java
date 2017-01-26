package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_15 {
    private final Production55_15 production = new Production55_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}