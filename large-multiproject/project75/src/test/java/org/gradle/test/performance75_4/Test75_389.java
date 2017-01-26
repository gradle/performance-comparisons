package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_389 {
    private final Production75_389 production = new Production75_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}