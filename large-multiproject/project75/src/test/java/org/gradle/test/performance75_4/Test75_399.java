package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_399 {
    private final Production75_399 production = new Production75_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}