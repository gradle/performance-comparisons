package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_115 {
    private final Production75_115 production = new Production75_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}