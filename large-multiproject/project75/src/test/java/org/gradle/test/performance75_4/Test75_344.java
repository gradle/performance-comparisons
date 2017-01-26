package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_344 {
    private final Production75_344 production = new Production75_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}