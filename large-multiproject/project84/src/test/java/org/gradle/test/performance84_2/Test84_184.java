package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_184 {
    private final Production84_184 production = new Production84_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}