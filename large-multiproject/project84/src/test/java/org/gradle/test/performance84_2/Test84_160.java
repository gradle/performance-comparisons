package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_160 {
    private final Production84_160 production = new Production84_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}