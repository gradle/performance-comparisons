package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_272 {
    private final Production75_272 production = new Production75_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}