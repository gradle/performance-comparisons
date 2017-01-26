package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_118 {
    private final Production84_118 production = new Production84_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}