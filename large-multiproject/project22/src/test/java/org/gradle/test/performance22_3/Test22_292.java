package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_292 {
    private final Production22_292 production = new Production22_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}