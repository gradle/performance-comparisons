package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_285 {
    private final Production75_285 production = new Production75_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}