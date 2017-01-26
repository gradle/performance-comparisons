package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_298 {
    private final Production22_298 production = new Production22_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}