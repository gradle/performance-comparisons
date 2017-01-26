package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_22 {
    private final Production75_22 production = new Production75_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}