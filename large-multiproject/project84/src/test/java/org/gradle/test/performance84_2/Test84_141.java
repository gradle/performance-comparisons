package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_141 {
    private final Production84_141 production = new Production84_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}