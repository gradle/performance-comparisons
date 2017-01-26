package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_346 {
    private final Production22_346 production = new Production22_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}