package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_333 {
    private final Production75_333 production = new Production75_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}