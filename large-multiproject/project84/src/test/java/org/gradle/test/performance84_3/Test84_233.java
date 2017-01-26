package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_233 {
    private final Production84_233 production = new Production84_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}