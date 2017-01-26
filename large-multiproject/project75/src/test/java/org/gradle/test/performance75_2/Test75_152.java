package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_152 {
    private final Production75_152 production = new Production75_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}