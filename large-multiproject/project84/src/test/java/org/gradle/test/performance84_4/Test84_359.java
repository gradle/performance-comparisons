package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_359 {
    private final Production84_359 production = new Production84_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}