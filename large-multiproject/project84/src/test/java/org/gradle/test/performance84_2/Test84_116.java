package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_116 {
    private final Production84_116 production = new Production84_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}