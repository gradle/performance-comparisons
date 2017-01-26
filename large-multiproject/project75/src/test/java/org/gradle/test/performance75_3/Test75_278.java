package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_278 {
    private final Production75_278 production = new Production75_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}