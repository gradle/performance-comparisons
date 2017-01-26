package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_132 {
    private final Production75_132 production = new Production75_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}