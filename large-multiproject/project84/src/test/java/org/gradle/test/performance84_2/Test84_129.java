package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_129 {
    private final Production84_129 production = new Production84_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}