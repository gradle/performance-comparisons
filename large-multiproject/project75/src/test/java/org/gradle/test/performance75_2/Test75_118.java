package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_118 {
    private final Production75_118 production = new Production75_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}