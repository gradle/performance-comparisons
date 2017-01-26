package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_130 {
    private final Production84_130 production = new Production84_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}