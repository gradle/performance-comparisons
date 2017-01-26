package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_407 {
    private final Production22_407 production = new Production22_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}