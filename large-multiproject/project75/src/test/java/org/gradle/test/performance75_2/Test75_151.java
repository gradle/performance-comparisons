package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_151 {
    private final Production75_151 production = new Production75_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}