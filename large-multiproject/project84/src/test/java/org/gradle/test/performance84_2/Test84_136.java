package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_136 {
    private final Production84_136 production = new Production84_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}