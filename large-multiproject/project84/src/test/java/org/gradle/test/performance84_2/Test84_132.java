package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_132 {
    private final Production84_132 production = new Production84_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}