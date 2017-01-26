package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_22 {
    private final Production84_22 production = new Production84_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}