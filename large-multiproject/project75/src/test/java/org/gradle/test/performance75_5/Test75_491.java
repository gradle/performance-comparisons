package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_491 {
    private final Production75_491 production = new Production75_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}