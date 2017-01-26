package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_285 {
    private final Production84_285 production = new Production84_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}