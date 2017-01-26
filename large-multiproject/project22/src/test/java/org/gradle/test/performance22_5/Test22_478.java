package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_478 {
    private final Production22_478 production = new Production22_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}