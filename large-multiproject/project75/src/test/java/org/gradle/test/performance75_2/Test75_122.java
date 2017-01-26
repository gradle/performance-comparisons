package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_122 {
    private final Production75_122 production = new Production75_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}