package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_116 {
    private final Production75_116 production = new Production75_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}