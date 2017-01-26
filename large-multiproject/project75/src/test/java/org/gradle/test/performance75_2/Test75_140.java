package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_140 {
    private final Production75_140 production = new Production75_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}