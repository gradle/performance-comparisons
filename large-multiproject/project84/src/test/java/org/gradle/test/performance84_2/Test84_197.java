package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_197 {
    private final Production84_197 production = new Production84_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}