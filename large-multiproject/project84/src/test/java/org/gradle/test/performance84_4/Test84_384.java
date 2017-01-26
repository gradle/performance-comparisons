package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_384 {
    private final Production84_384 production = new Production84_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}