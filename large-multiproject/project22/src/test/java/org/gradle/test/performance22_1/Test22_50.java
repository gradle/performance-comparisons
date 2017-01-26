package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_50 {
    private final Production22_50 production = new Production22_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}