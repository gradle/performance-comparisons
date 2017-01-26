package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_341 {
    private final Production75_341 production = new Production75_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}