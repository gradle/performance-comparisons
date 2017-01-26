package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_94 {
    private final Production75_94 production = new Production75_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}