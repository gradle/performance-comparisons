package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_13 {
    private final Production75_13 production = new Production75_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}