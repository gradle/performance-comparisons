package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_194 {
    private final Production84_194 production = new Production84_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}