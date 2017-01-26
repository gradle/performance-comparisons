package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_327 {
    private final Production22_327 production = new Production22_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}