package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_149 {
    private final Production75_149 production = new Production75_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}