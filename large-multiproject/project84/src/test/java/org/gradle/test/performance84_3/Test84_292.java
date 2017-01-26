package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_292 {
    private final Production84_292 production = new Production84_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}