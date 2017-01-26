package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_285 {
    private final Production47_285 production = new Production47_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}