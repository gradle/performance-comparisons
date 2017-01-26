package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_105 {
    private final Production84_105 production = new Production84_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}