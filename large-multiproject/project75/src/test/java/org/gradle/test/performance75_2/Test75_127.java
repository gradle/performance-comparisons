package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_127 {
    private final Production75_127 production = new Production75_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}