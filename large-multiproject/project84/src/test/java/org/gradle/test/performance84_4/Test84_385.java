package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_385 {
    private final Production84_385 production = new Production84_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}