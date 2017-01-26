package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_391 {
    private final Production84_391 production = new Production84_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}