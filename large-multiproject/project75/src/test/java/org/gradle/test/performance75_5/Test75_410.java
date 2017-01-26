package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_410 {
    private final Production75_410 production = new Production75_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}