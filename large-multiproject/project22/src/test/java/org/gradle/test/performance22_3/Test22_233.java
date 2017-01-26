package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_233 {
    private final Production22_233 production = new Production22_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}