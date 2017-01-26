package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_141 {
    private final Production75_141 production = new Production75_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}