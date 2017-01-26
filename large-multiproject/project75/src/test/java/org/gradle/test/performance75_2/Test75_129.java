package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_129 {
    private final Production75_129 production = new Production75_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}