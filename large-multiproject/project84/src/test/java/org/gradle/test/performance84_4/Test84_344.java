package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_344 {
    private final Production84_344 production = new Production84_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}