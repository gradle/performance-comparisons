package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_279 {
    private final Production22_279 production = new Production22_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}