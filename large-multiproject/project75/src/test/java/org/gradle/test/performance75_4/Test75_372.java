package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_372 {
    private final Production75_372 production = new Production75_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}