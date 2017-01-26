package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_142 {
    private final Production75_142 production = new Production75_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}