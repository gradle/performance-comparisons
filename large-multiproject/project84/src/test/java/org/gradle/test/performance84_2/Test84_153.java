package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_153 {
    private final Production84_153 production = new Production84_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}