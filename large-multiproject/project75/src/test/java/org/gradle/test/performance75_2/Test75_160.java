package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_160 {
    private final Production75_160 production = new Production75_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}