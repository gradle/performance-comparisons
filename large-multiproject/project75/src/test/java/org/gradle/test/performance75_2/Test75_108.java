package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_108 {
    private final Production75_108 production = new Production75_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}