package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_21 {
    private final Production75_21 production = new Production75_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}