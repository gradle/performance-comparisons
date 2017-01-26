package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_105 {
    private final Production75_105 production = new Production75_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}