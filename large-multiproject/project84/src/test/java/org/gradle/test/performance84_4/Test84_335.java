package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_335 {
    private final Production84_335 production = new Production84_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}