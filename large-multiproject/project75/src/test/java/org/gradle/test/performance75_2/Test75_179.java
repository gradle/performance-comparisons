package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_179 {
    private final Production75_179 production = new Production75_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}