package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_285 {
    private final Production22_285 production = new Production22_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}