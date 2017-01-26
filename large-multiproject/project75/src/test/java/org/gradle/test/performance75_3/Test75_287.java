package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_287 {
    private final Production75_287 production = new Production75_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}