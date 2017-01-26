package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_389 {
    private final Production22_389 production = new Production22_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}