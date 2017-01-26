package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_295 {
    private final Production22_295 production = new Production22_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}