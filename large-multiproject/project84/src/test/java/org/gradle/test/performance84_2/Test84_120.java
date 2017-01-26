package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_120 {
    private final Production84_120 production = new Production84_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}