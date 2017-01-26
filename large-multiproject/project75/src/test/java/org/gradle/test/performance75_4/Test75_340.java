package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_340 {
    private final Production75_340 production = new Production75_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}