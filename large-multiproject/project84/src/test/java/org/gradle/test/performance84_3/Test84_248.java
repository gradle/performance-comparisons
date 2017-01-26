package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_248 {
    private final Production84_248 production = new Production84_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}