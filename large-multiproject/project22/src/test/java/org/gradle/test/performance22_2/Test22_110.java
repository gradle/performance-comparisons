package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_110 {
    private final Production22_110 production = new Production22_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}