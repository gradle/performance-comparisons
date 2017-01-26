package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_250 {
    private final Production75_250 production = new Production75_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}