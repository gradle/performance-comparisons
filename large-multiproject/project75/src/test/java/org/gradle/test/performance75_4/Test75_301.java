package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_301 {
    private final Production75_301 production = new Production75_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}