package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_275 {
    private final Production75_275 production = new Production75_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}