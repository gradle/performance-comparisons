package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_430 {
    private final Production22_430 production = new Production22_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}