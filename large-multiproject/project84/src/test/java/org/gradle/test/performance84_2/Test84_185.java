package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_185 {
    private final Production84_185 production = new Production84_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}