package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_165 {
    private final Production75_165 production = new Production75_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}