package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_298 {
    private final Production84_298 production = new Production84_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}